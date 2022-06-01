package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DocumentTobeSent(
    var name : String?,
    var type : String?,
    var source : String?,
    var image64 : String?,
    @SerializedName("type_document_id")
    var typeDocumentId : Int?,
    @SerializedName("simulation_id")
    var simulationId : Int?,


) : Serializable {

}