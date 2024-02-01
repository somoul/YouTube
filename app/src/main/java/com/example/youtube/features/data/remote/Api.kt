package com.example.youtube.features.data.remote

import com.example.youtube.features.domain.Model.UserModel

interface Api {
    fun getData(): List<UserDto>
}