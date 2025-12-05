package com.example.securedoorlockapp.network

import retrofit2.http.GET

data class AccessLog(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val status: String,
    val timestamp: String
)

interface ApiService {
    @GET("access_logs.json")
    suspend fun getLogs(): List<AccessLog>
}
