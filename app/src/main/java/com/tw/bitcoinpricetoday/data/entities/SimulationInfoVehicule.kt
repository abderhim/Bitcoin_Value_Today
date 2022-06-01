package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class SimulationInfoVehicule(
        @SerializedName("SimulationInfoVehMarque")
        var marque : String?,
        @SerializedName("SimulationInfoVehModele")
        var modele : String?,
        @SerializedName("SimulationInfoVehEtat")
        var etatDeBien : String?,
        ) : Serializable {

}