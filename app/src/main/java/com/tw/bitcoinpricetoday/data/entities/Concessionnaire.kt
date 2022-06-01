package com.tw.bitcoinpricetoday.data.entities


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Concessionnaire(
    @SerializedName("CategorieAssuranceId")
    val concessCategorieAssuranceId: Any?,
    @SerializedName("CategorieSiteId")
    val concessCategorieSiteId: Any?,
    @SerializedName("CreatedAt")
    val concessCreatedAt: String?,
    @SerializedName("DeletedAt")
    val concessDeletedAt: Any?,
    @SerializedName("DeletedBy")
    val concessDeletedBy: Any?,
    @SerializedName("IdFiscal")
    val concessIdFiscal: Any?,
    @SerializedName("IdQualiteRattachement")
    val concessIdQualiteRattachement: Any?,
    @SerializedName("IdQualiteSociete")
    val concessIdQualiteSociete: Any?,
    @SerializedName("IdRefVille")
    val concessIdRefVille: Any?,
    @SerializedName("NumCin")
    val concessNumCin: Any?,
    @SerializedName("SegmentSiteId")
    val concessSegmentSiteId: Any?,
    @SerializedName("SiteActive")
    val concessSiteActive: Boolean?,
    @SerializedName("site_adresse_1")
    val concessSiteAdresse1: String?,
    @SerializedName("site_adresse_2")
    val concessSiteAdresse2: String?,
    @SerializedName("site_adresse_3")
    val concessSiteAdresse3: String?,
    @SerializedName("SiteAdresseWeb")
    val concessSiteAdresseWeb: Any?,
    @SerializedName("SiteCodeRegion")
    val concessSiteCodeRegion: String?,
    @SerializedName("SiteCodeReseau")
    val concessSiteCodeReseau: String?,
    @SerializedName("SiteCodeSecteur")
    val concessSiteCodeSecteur: String?,
    @SerializedName("SiteCommentaires")
    val concessSiteCommentaires: String?,
    @SerializedName("SiteCommission")
    val concessSiteCommission: String?,
    @SerializedName("SiteCp")
    val concessSiteCp: Any?,
    @SerializedName("SiteCreatedBy")
    val concessSiteCreatedBy: Int?,
    @SerializedName("SiteDirigeantMail")
    val concessSiteDirigeantMail: Any?,
    @SerializedName("SiteDirigeantNom")
    val concessSiteDirigeantNom: Any?,
    @SerializedName("SiteDirigeantPortable")
    val concessSiteDirigeantPortable: String?,
    @SerializedName("SiteDirigeantPrenom")
    val concessSiteDirigeantPrenom: Any?,
    @SerializedName("SiteDirigeantTel")
    val concessSiteDirigeantTel: String?,
    @SerializedName("SiteId")
    val concessSiteId: Int?,
    @SerializedName("SiteIdClient")
    val concessSiteIdClient: String?,
    @SerializedName("SiteLogo")
    val concessSiteLogo: Any?,
    @SerializedName("SiteMail")
    val concessSiteMail: String?,
    @SerializedName("site_name")
    val concessSite_name: String?,
    @SerializedName("SiteNomCommercial")
    val concessSiteNomCommercial: String?,
    @SerializedName("SiteOrias")
    val concessSiteOrias: String?,
    @SerializedName("SiteRaison")
    val concessSiteRaison: String?,
    @SerializedName("SiteRefBancaires")
    val concessSiteRefBancaires: String?,
    @SerializedName("SiteReseau")
    val concessSiteReseau: String?,
    @SerializedName("SiteRespMail")
    val concessSiteRespMail: Any?,
    @SerializedName("SiteRespNom")
    val concessSiteRespNom: Any?,
    @SerializedName("SiteRespPortable")
    val concessSiteRespPortable: Any?,
    @SerializedName("SiteRespPrenom")
    val concessSiteRespPrenom: Any?,
    @SerializedName("SiteRespTechMail")
    val concessSiteRespTechMail: Any?,
    @SerializedName("SiteRespTechNom")
    val concessSiteRespTechNom: Any?,
    @SerializedName("SiteRespTechPortable")
    val concessSiteRespTechPortable: Any?,
    @SerializedName("SiteRespTechPrenom")
    val concessSiteRespTechPrenom: Any?,
    @SerializedName("SiteRespTechTel")
    val concessSiteRespTechTel: Any?,
    @SerializedName("SiteRespTel")
    val concessSiteRespTel: Any?,
    @SerializedName("SiteSiren")
    val concessSiteSiren: Any?,
    @SerializedName("SiteTel")
    val concessSiteTel: String?,
    @SerializedName("SiteTelFaxe")
    val concessSiteTelFaxe: String?,
    @SerializedName("SiteUpdatedBy")
    val concessSiteUpdatedBy: Int?,
    @SerializedName("SiteVille")
    val concessSiteVille: Any?,
    @SerializedName("UpdatedAt")
    val concessUpdatedAt: String?,
    @SerializedName("vendeur_name")
    val vendeur_name: String?,
    @SerializedName("vendeur_tel")
    val vendeur_tel: String?,
    @SerializedName("vendeur_mail")
    val vendeur_mail: String?,
): Serializable