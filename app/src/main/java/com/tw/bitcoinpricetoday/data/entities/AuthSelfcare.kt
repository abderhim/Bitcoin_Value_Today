package com.tw.bitcoinpricetoday.data.entities

import java.io.Serializable

data class AuthSelfcare (
    var error : Boolean?,
    var message : String?,
    var data : dataAuth?
) : Serializable