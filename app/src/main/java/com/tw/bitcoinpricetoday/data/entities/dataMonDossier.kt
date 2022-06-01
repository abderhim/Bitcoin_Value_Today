package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class dataMonDossier(

        @SerializedName("TblSimulationAsss")
        var tblSimulationAsss: List<SimulationAssurance>?,
        @SerializedName("TblSimulationInfoVeh")
        var tblSimulationInfoVehicule: SimulationInfoVehicule?,
        @SerializedName("SimulationApport")
        var simulationApport: String?,
        @SerializedName("SimulationPrixVente")
        var simulationPrixVente: String?,
        @SerializedName("TypeFinancement")
        var typeFinancement: TypeFinancement?,
        @SerializedName("TblSimulationMensualites")
        var tblSimulationMensualites: List<SimulationMensualite>?,
        @SerializedName("SimulationDuree")
        var simulationDuree: Int?,
        @SerializedName("SimulationId")
        var simulationID: Int?,
        @SerializedName("CreatedAt")
        var date: String?,
        @SerializedName("SimulationPdf")
        var simulationPdf: String?,
        var workflow: WorkflowItem,
        @SerializedName("SimulationBaremePeriodicite")
        var simulationPeriodicite: Int?,
        @SerializedName("CoEmprunteurs")
        var coEmprunteurs: List<CoEmprunteur>?,
        @SerializedName("SimulationMarche")
        var simulationMarket: Int?,
        var profil: ProfileEmprunteur?,
) : Serializable {

}