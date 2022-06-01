package com.tw.bitcoinpricetoday.data.entities

import java.io.Serializable

data class DocumentBySimulation (

    var error : Boolean?,
    var code : Int?,
    var data : List<DataDocumentBySimulation?>


) : Serializable {

}