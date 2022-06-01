package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class TypeFinancement(

        @SerializedName("TypeFinancementId")
        var typeFinancementId : Int?,
        @SerializedName("TypeFinancementLibelle")
        var typeFinancementLibelle : String?
) : Serializable {

}