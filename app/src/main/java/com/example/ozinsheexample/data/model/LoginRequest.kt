package com.example.ozinsheexample.data.model


import com.google.gson.annotations.SerializedName

data class LoginRequest(
    @SerializedName("email")
    val email: String, // string12345678@gmail.com
    @SerializedName("password")
    val password: String // timaton12
)