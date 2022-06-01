package com.tw.bitcoinpricetoday.data.network

import com.tw.bitcoinpricetoday.data.entities.*
import retrofit2.Response
import retrofit2.http.*

interface BitcoinAPI {


    @GET("/v1/bpi/currentprice.json")
    suspend fun getBitcoinValue(
    ):BitcoinData


}