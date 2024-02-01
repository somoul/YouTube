package com.example.youtube.features.data.mapper

import com.example.youtube.features.data.remote.UserDto
import com.example.youtube.features.domain.Model.UserModel

fun  UserDto.toUser() :UserModel{
 return UserModel(
     name = name?:""
 )
}
