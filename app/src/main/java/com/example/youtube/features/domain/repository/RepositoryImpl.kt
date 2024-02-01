package com.example.youtube.features.domain.repository

import com.example.youtube.features.data.mapper.toUser
import com.example.youtube.features.data.remote.Api
import com.example.youtube.features.data.repository.Repository
import com.example.youtube.features.domain.Model.UserModel

class RepositoryImpl(
    val api :Api
) : Repository {
    override suspend fun getData(): List<UserModel> {
        return  api.getData().map {
            it.toUser()
        }
    }
}