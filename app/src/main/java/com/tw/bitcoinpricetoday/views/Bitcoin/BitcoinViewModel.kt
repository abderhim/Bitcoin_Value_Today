package com.tw.bitcoinpricetoday.views.Bitcoin

import android.app.Application
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.tw.bitcoinpricetoday.data.repositories.CurrencyValueRepositoy
import com.tw.bitcoinpricetoday.utilities.ApiResponseCodes.API_UNAUTHORIZED
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import retrofit2.HttpException
import javax.inject.Inject

@HiltViewModel
class BitcoinViewModel @Inject constructor(
    private val currencyValueRepositoy: CurrencyValueRepositoy
) : ViewModel() {



    fun getBitcoinData(context: Context)  = liveData(Dispatchers.IO) {
        try {
            emit( currencyValueRepositoy.getBitcoinData())
        }
        catch (e: HttpException){
            if(e.code()==API_UNAUTHORIZED)
            {

           emit(null)
            }
        }

    }






}