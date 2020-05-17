package com.example.covid_19.DataIndo

import com.example.covid_19.indonesiaItem
import retrofit2.Call
import retrofit2.http.GET

interface IndoService {
    @GET("indonesia")
    fun getUsers(): Call<List<indonesiaItem>>
}