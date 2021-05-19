package com.example.projetoentrevistadeemprego.api

import com.example.projetoentrevistadeemprego.Image
import retrofit2.Call
import retrofit2.http.GET

import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.Headers
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface Endpoint {

    @GET("photos")
   fun list()
/*
    @Multipart
    @POST("/3/upload")
    suspend fun uploadFile(
        @Part image: MultipartBody.Part?,
        @Part("name") name: RequestBody? = null
    ): Response<Image>
}
object ApiKeys{
    const val CLIENT_ID = "1ceddedc03a5d71"

 */

}


