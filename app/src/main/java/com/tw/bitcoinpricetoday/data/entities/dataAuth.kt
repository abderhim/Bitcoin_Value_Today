package com.tw.bitcoinpricetoday.data.entities

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class dataAuth (
    var token : String?,
    @SerializedName("infos_user")
    var infosUser : UserInfo?,
    var marche: Marche?,
    var workflow: List<WorkflowItem>,
    var contacts: Contact?
) : Serializable