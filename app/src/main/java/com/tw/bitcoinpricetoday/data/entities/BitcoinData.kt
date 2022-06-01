package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class BitcoinData (


    var time : Time,
    var disclaimer : String?,
    var chartName : String?,
    var bpi : Currency?,
    var origin_name : String,

    ) : Serializable {

}