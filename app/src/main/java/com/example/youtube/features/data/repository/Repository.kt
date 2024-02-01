package com.example.youtube.features.data.repository

import com.example.youtube.features.domain.Model.UserModel

interface Repository {
   suspend fun  getData(): List<UserModel>
}