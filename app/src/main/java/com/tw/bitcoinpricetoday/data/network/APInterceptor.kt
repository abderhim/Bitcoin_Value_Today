package com.tw.bitcoinpricetoday.data.network

import okhttp3.*

abstract class APInterceptor : Interceptor{

    abstract fun isNetworkAvailable():Boolean
    abstract fun onNetworkUnAvailable()
    override fun intercept(chain: Interceptor.Chain): Response? {
        val request = chain.request()
        if(!isNetworkAvailable()){
            onNetworkUnAvailable()
        }
        return try {
            chain.proceed(request)
        }catch (e: Exception){
            Response.Builder()
                .body(ResponseBody.create(MediaType.parse("application/json"),"[]"))
                .code(400)
                .protocol(Protocol.HTTP_2)
                .message("Error")
                .request(chain.request())
                .build()
        }
    }

}