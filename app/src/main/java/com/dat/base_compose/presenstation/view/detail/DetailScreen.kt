package com.dat.base_compose.presenstation.view.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.dat.base_compose.presenstation.theme.CustomColorTheme

@Composable
internal fun DetailRoute(onClickNavigate: () -> Unit) {
    DetailScreen(onClickNavigate)
}

@Composable
fun DetailScreen(onClickNavigate: () -> Unit) {
    Column(
        Modifier
            .fillMaxSize()
            .background(CustomColorTheme.current.backGround),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    )
    {
        Text(text = "Detail Screen", color = CustomColorTheme.current.textTitle)
        Button(onClick = onClickNavigate) {
            Text(text = "Click here to navigate")
        }
    }
}
