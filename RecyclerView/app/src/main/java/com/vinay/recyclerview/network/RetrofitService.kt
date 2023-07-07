package com.vinay.recyclerview.network

import retrofit2.Response
import retrofit2.http.GET

import com.vinay.recyclerview.model.Results

interface RetrofitService {
    @GET("http://ergast.com/api/f1/2004/1/results.json")
    suspend fun getPosts(): Response<Results>
}