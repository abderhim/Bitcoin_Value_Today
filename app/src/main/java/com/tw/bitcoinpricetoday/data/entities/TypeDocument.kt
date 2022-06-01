package com.tw.bitcoinpricetoday.data.entities

import java.io.Serializable

data class TypeDocument (

    var error : Boolean?,
    var code : Int?,
    var data : List<DataTypeDocument>?


) : Serializable {

}