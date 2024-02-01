@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.youtube.common
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.youtube.features.Extension.Completion

@Composable
fun CustomTopBar(
    title: String,
    iconBack: ImageVector,
    iconAction: ImageVector,
    onBack: Completion,
    onAction: Completion

) {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = onBack) {
                Icon(imageVector = iconBack, contentDescription = "")
            }
        },
        title = {
            Text(text = title)
        },
        actions = {
            IconButton(onClick = onAction) {
                Icon(imageVector = iconAction, contentDescription = "")
            }
        }

    )

}

