package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class JsonSendDocument (

    @SerializedName("json")
    var json : DocumentTobeSent?,
    ) : Serializable {

}