package com.example.flixter

import com.google.gson.annotations.SerializedName

class LatestMovie {
    @SerializedName("poster_path")
    var movieImageUrl: String? = null

//    @JvmField
    @SerializedName("title")
    var title: String? = null

    @SerializedName("overview")
    var description: String? = null
}