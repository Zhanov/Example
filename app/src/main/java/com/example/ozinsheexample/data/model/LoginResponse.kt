package com.example.ozinsheexample.data.model


import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("id")
    val id: Int, // 25874
    @SerializedName("username")
    val username: String, // string12345678@gmail.com
    @SerializedName("email")
    val email: String, // string12345678@gmail.com
    @SerializedName("roles")
    val roles: List<String>,
    @SerializedName("accessToken")
    val accessToken: String, // eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzdHJpbmcxMjM0NTY3OEBnbWFpbC5jb20iLCJpYXQiOjE3MzU0ODg0ODQsImV4cCI6MTc2NzAyNDQ4NH0.Y81aUiBUBrfBXiLVnVUvgx_45fu5QCZXuTUr7A57omJ6Imjcm2Yg7-OCgaaJnMfUEhZl7ZxnllsAP8PoM4GkDw
    @SerializedName("tokenType")
    val tokenType: String // Bearer
)