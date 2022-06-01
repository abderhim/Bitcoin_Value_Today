package com.tw.bitcoinpricetoday.data.entities

import java.io.Serializable

data class ResponseSendDocs(
    var code : Int?,
    var message : String?
) : Serializable {

}