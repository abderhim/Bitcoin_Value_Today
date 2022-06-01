package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UserInfo (
    var nom : String?,
    var prenom : String?,
    @SerializedName("date_naissance")
    var dateNaissance : String? = null,
    var email : String? = null,
    var passwordCrypted : String? = null,
    var tel : String? = null,

) : Serializable {

}