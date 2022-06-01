package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Prestation (
    @SerializedName("XmlProduitLibelle")
    var libelle : String?,
    @SerializedName("Description")
    var description : String?,


    ) : Serializable {

}