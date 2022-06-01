package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DataOffreFinanciere (

    @SerializedName("TblSimulationAsss")
    var tblSimulationAsss: List<SimulationAssurance>?,
    @SerializedName("TblSimulationInfoVeh")
    var tblSimulationInfoVehicule: SimulationInfoVehicule,
    @SerializedName("SimulationApport")
    var simulationApport: String?,
    @SerializedName("SimulationPrixVente")
    var simulationPrixVente: String?,
    @SerializedName("TypeFinancement")
    var typeFinancement: TypeFinancement,
    @SerializedName("TblSimulationMensualites")
    var tblSimulationMensualites: List<SimulationMensualite>?,
    @SerializedName("SimulationDuree")
    var simulationDuree: String?,
    @SerializedName("SimulationId")
    var simulationID: Int?,
    @SerializedName("CreatedAt")
    var date: String?,
    @SerializedName("SimulationPdf")
    var simulationPdf: String?,
    @SerializedName("SimulationBaremePeriodicite")
    var SimulationBaremePeriodicite: Int?,

) : Serializable {

}