package com.tw.bitcoinpricetoday.data.entities

import java.io.Serializable

data class OffreFinanciere (

    var error : Boolean?,
    var data : List<DataOffreFinanciere?>?,
    var message: String?
) : Serializable {

}