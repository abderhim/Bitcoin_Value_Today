package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ResponsableCommercial(
    @SerializedName("CreatedAt")
    var createdAt: String?,
    @SerializedName("DeletedBy")
    var deletedBy: Int?,
    @SerializedName("FonctId")
    var fonctId: Int?,
    @SerializedName("FonctionApplicativeId")
    var fonctionApplicativeId: Int?,
    @SerializedName("FonctionId")
    var fonctionId: Int?,
    @SerializedName("ProfilTerminalId")
    var profilTerminalId: Int?,
    @SerializedName("RefFonction")
    var refFonction: RefFonction? = RefFonction(),
    @SerializedName("SiteId")
    var siteId: Int?,
    @SerializedName("UpdatedAt")
    var updatedAt: String?,
    @SerializedName("UserActif")
    var userActif: Boolean?,
    @SerializedName("UserApr")
    var userApr: Any?,
    @SerializedName("UserDns")
    var userDns: String?,
    @SerializedName("UserFax")
    var userFax: Any?,
    @SerializedName("UserId")
    var userId: Int?,
    @SerializedName("UserLogin")
    var userLogin: String?,
    @SerializedName("UserMail")
    var userMail: String?,
    @SerializedName("UserNom")
    var userNom: String?,
    @SerializedName("UserNotifie")
    var userNotifie: Int?,
    @SerializedName("UserPrenom")
    var userPrenom: String?,
    @SerializedName("UserTel")
    var userTel: String?,
    @SerializedName("UserTelPortable")
    var userTelPortable: Any?,
    @SerializedName("XmlGroupeSliderId")
    var xmlGroupeSliderId: Int?,
    @SerializedName("rs_name")
    var rs_name: String?,
    @SerializedName("rs_tel")
    var rs_tel: String?,
    @SerializedName("rs_mail")
    var rs_mail: String?,


    var deletedAt: Any? = Any() // null
): Serializable {

    fun getFullName(): String{
        return  "${this.userPrenom} ${this.userNom}"
    }

}