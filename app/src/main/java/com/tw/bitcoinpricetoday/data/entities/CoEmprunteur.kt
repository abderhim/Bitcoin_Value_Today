package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CoEmprunteur (
    @SerializedName("SimulationInfoClientNom")
    var nom : String?,

    @SerializedName("SimulationInfoClientPrenom")
    var prenom: String?,

    @SerializedName("SimulationInfoClientDateNaissance")
    var dateNaissance: String,

    @SerializedName("SimulationInfoClientEmail")
    var email: String,

    @SerializedName("SimulationInfoClientTelPort")
    var telephone: String,

    @SerializedName("SimulationInfoClientIsConjoint")
    var relationLocataire: Boolean

) : Serializable