package com.example.covid_19.DataProv


import com.example.covid_19.ProvinsiItem
import retrofit2.Call
import retrofit2.http.GET

interface ProvinsiService {
    @GET("indonesia/provinsi/")
    fun getProvinsi(): Call<List<ProvinsiItem>>
}
