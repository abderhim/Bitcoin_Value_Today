package com.tw.bitcoinpricetoday.data.entities

import android.net.Uri
import java.io.Serializable

data class ImageSelf (

    var name : String?,
    var origin_name: String?,
    var uri : Uri?,
    var type : String?,
    ) : Serializable {

}