package com.tw.bitcoinpricetoday.data.entities

import java.io.Serializable

data class Document(

        var id : Int?,
        var libelle : String?,
        var description : String?,
        var status : String?,
        var date: String?,
        var ListImages: ArrayList<ImageSelf>?,
        var isObligatoire : Boolean?,
        var documentTypeCode: String?,
        var documentTypeFile: String?,

        ) : Serializable {

}