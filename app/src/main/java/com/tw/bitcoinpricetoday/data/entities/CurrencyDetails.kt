package com.tw.bitcoinpricetoday.data.entities

import java.io.Serializable

data class CurrencyDetails  (

        var code  : String?,
        var rate : String?,
        var description : String?,
        var rate_float : Double?,

        ) : Serializable {

}