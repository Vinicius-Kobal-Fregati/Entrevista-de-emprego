package com.example.projetoentrevistadeemprego.api

import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

class ApiUtils {

    private val retrofit = Retrofit.Builder()
            .baseUrl("https://api.imgur.com/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
}