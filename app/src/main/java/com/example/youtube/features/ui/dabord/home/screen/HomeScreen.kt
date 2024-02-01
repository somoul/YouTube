package com.example.youtube.features.ui.dabord.home.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.youtube.common.CustomTopBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            CustomTopBar(
                title = "",
                iconBack = Icons.Outlined.ArrowBack,
                iconAction = Icons.Outlined.Add,
                onBack = {},
                onAction = {}
            )

        },
        content = {
            Column(modifier = Modifier
                .fillMaxSize()
                .background(Color.Red)){
                Text(text = "YouTun")
                
            }

        }
    )

}


@Preview
@Composable
fun ViewHomeScreen() {
    HomeScreen()

}