package com.benedetto.data.repository.remote.api

import com.benedetto.data.repository.remote.model.UserResponse
import retrofit2.http.GET

fun interface UserApiService {
    @GET("posts")
    suspend fun getUsers(): List<UserResponse>
}
