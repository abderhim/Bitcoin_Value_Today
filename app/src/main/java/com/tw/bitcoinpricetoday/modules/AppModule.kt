package com.tw.bitcoinpricetoday.components.modules


import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.tw.bitcoinpricetoday.R

import com.tw.bitcoinpricetoday.data.network.APInterceptor
import com.tw.bitcoinpricetoday.data.network.BitcoinAPI
import com.tw.bitcoinpricetoday.utilities.LOCAL_BRAODCAST_INTERNET_ACTION
import com.tw.bitcoinpricetoday.utilities.isOnline
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideOkHttpClient(@ApplicationContext app: Context): OkHttpClient {
        return OkHttpClient().newBuilder()
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .addInterceptor(object : APInterceptor() {
                override fun isNetworkAvailable(): Boolean {
                    return isOnline(app)
                }

                override fun onNetworkUnAvailable() {
                    LocalBroadcastManager.getInstance(app)
                        .sendBroadcast(
                            Intent(LOCAL_BRAODCAST_INTERNET_ACTION)
                                .putExtra(app.resources.getString(R.string.error), app.resources.getString(R.string.cnxNotOk)))
                    GlobalScope.launch(Dispatchers.Main) {
                        Toast.makeText(
                            app,
                            app.getString(R.string.cnxNotOk),
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }

            })
            .build()
    }


    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, @ApplicationContext app: Context): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(app.getString(R.string.API_ENDPOINT))
            .client(okHttpClient)
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()

    }


    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): BitcoinAPI = retrofit.create(BitcoinAPI::class.java)


}