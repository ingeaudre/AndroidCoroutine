package com.example.androidcoroutine.network

import com.example.androidcoroutine.models.RecyclerList
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {

    @GET("repositories")
    suspend fun getDataFromApi(@Query("q") query: String): RecyclerList
}