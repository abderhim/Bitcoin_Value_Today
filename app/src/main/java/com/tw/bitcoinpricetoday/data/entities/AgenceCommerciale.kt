package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class AgenceCommerciale(
    @SerializedName("AgenceRattachementId")
    var agenceRattachementId: Int?,
    @SerializedName("AgenceTypeId")
    var agenceTypeId: Int?,
    @SerializedName("CreatedAt")
    var createdAt: String?,
    @SerializedName("DeletedAt")
    var deletedAt: Any?,
    @SerializedName("DeletedBy")
    var deletedBy: Any?,
    @SerializedName("MarcheId")
    var marcheId: Int?,
    @SerializedName("SiteId")
    var siteId: Int?,
    @SerializedName("SocieteGestionId")
    var societeGestionId: Int?,
    @SerializedName("UpdatedAt")
    var updatedAt: String?,
    @SerializedName("ZoneId")
    var zoneId: Int?,
    @SerializedName("ZoneLeft")
    var zoneLeft: Int?,
    @SerializedName("ZoneLevel")
    var zoneLevel: Int?,
    @SerializedName("ZoneLibelle")
    var zoneLibelle: String?,
    @SerializedName("ZoneLogo")
    var zoneLogo: Any?,
    @SerializedName("ZoneNiveauId")
    var zoneNiveauId: Int?,
    @SerializedName("ZoneResponsable")
    var zoneResponsable: String?,
    @SerializedName("ZoneResponsableMail")
    var zoneResponsableMail: String?,
    @SerializedName("ZoneResponsableTel")
    var zoneResponsableTel: String?,
    @SerializedName("ZoneRight")
    var zoneRight: Int?,
    @SerializedName("ZoneScope")
    var zoneScope: Int?,
    @SerializedName("ZoneSigle")
    var zoneSigle: Any?,
    @SerializedName("ZoneVille")
    var zoneVille: Any?,
    @SerializedName("agence_name")
    var agence_name: String?,
    @SerializedName("agence_adresse1")
    var agence_adresse1: String?,
    @SerializedName("agence_adresse2")
    var agence_adresse2: String?,
    @SerializedName("agence_adresse3")
    var agence_adresse3: String?,
    @SerializedName("agence_tel")
    var agence_tel: String?,
    @SerializedName("agence_mail")
    var agence_mail: String?,
): Serializable