package com.example.covid_19


import com.google.gson.annotations.SerializedName

data class ProvinsiItem(
    @SerializedName("attributes")
    val attributes: Attributes
)