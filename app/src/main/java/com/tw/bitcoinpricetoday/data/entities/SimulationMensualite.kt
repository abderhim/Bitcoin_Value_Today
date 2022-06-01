package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class SimulationMensualite(

        @SerializedName("SimulationMensualiteMontant")
        var simulationMensualiteMontant : String?,
        @SerializedName("SimulationMensualiteMontantSansAssurance")
        var simulationMensualiteMontantSansAssurance : String?,
        @SerializedName("SimulationMensualiteDuree")
        var simulationMensualiteDuree : String?,

        ) : Serializable {

}