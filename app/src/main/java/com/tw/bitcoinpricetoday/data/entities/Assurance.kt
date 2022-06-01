package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Assurance (
    @SerializedName("assurance_name")
    var assurance_name: String?,
    @SerializedName("assurance_adresse1")
    var assurance_adresse1: String?,
    @SerializedName("assurance_adresse2")
    var assurance_adresse2: String?,
    @SerializedName("assurance_adresse3")
    var assurance_adresse3: String?,
    @SerializedName("assurance_tel")
    var assurance_tel: String?,
    @SerializedName("assurance_mail")
    var assurance_mail: String?,


): Serializable {


}