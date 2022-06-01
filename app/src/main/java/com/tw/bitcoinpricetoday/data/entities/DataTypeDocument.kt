package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DataTypeDocument(

        @SerializedName("DocumentTypeId")
        var id: Int?,
        @SerializedName("DocumentTypeLibelle")
        var libelle: String,
        @SerializedName("DocumentTypeDescription")
        var description: String,
        var listofDocuments: ArrayList<DataDocumentBySimulation>?,
        var isObligatoire: Boolean,
        @SerializedName("DocumentTypeCode")
        var documentTypeCode: String?,
        @SerializedName("DocumentTypeFile")
        var documentTypeFile: String?

) : Serializable {

}