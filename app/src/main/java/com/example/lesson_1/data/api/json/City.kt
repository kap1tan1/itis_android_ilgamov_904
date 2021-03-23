package com.example.lesson_1.data.api.json

import Clouds
import Coord
import Main
import Sys
import Weather
import Wind
import com.google.gson.annotations.SerializedName


data class City(
    @SerializedName("clouds")
    var clouds: Clouds?,
    @SerializedName("coord")
    var coord: Coord?,
    @SerializedName("dt")
    var dt: Int?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("main")
    var main: Main?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("rain")
    var rain: Any?,
    @SerializedName("snow")
    var snow: Any?,
    @SerializedName("sys")
    var sys: Sys?,
    @SerializedName("weather")
    var weather: List<Weather>?,
    @SerializedName("wind")
    var wind: Wind?
)