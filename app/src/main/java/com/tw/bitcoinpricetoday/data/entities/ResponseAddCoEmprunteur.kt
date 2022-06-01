package com.tw.bitcoinpricetoday.data.entities

import java.io.Serializable


data class ResponseAddCoEmprunteur(
        var message: String?,
        var error: Boolean?,
) : Serializable