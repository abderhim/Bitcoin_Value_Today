package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DataDocumentBySimulation (

    @SerializedName("type_document_id")
    var id : Int?,
    @SerializedName("type_document_lib")
    var libelle : String,
    @SerializedName("date_upload")
    var dateUpload : String,
    var url : String,
    var status : StatusDocBySim,
    var origin_name : String,

) : Serializable {

}