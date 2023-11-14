package com.allforyou.app
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query


interface ApiService {
    @Headers("accept: application/json","Content-Type: application/json")
    @POST("api/auth/login")
    fun login(@Body loginRequest: LoginRequest): Call<AccessToken>

    @POST("api/auth/signup")
    fun register(@Body registerRequest: RegisterRequest) : Call<RegisterRequest>

    @POST("api/auth/sendcode")
    fun sendCode(@Body phoneAuthenticationRequest: PhoneAuthenticationRequest) : Call<Unit>

    @POST("api/auth/checkcode")
    fun checkCode(@Body phoneAuthenticationRequest: PhoneAuthenticationRequest) : Call<Unit>
}