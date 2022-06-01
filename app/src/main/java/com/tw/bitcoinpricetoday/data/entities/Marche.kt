package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Marche (
    @SerializedName("MarcheId")
    var marcheId : Int,
    @SerializedName("MarcheLib")
    var marcheLib : String?,


    ) : Serializable {

}