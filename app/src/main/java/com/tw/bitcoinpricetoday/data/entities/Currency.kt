package com.tw.bitcoinpricetoday.data.entities

import java.io.Serializable

data class Currency  (

    var USD  : CurrencyDetails?,
    var GBP : CurrencyDetails?,
    var EUR : CurrencyDetails?,
    ) : Serializable {

}