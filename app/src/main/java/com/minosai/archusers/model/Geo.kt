package com.minosai.archusers.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by minos.ai on 10/05/18.
 */
data class Geo(
        @SerializedName("lat") @Expose val lat: String = "",
        @SerializedName("lng") @Expose val lng: String = ""
)