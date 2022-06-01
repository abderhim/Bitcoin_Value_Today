package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Contact(
    @SerializedName("agence_commerciale")
    var agenceCommerciale: AgenceCommerciale?,
    @SerializedName("concessionnaire")
    var concessionnaire: Concessionnaire?,
    @SerializedName("responsable_commercial")
    var responsableCommercial: ResponsableCommercial?,
    @SerializedName("assurance")
    var assurance: Assurance?
): Serializable