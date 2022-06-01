package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CoEmprunteurToBeSent (
        var nom : String,
        var prenom: String,
        var email: String,
        var telephone: String,
        var dateNaissance: String,
        var relationLocataire: Int

) : Serializable