package com.example.lifelike.composable.common

import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme

@Composable
fun BigButton(text: String, onClick: () -> Unit) {
    Button(onClick = onClick) {
        Text(
            text = text.toUpperCase(),
            style = MaterialTheme.typography.body1.copy(color = Color.White)
        )
    }
}
