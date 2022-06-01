package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class RefFonction(
        @SerializedName("FonctionId")
        var fonctionId: Int? = 0, // 1
        @SerializedName("FonctionLibelle")
        var fonctionLibelle: String? = "" // Vendeur
) : Serializable