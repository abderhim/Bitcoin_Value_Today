package com.tw.bitcoinpricetoday.data.entities

import java.io.Serializable

data class MonDossier(
        var error: Boolean?,
        var code: Int?,
        var message: String?,
        var data: dataMonDossier?
) : Serializable