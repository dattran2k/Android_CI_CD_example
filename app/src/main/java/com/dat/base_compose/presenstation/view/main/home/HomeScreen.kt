package com.dat.base_compose.presenstation.view.main.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.hilt.navigation.compose.hiltViewModel
import com.dat.base_compose.presenstation.theme.CustomColorTheme


@Composable
fun HomeScreen(
    onNavigateDetail: () -> Unit,
    viewModel: HomeViewModel = hiltViewModel(),
) {
    Column(
        Modifier
            .fillMaxSize()
            .background(CustomColorTheme.current.backGround),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Home Screen", color = CustomColorTheme.current.textTitle)
        Button(onClick = onNavigateDetail) {
            Text(text = "Click here to navigate")
        }
    }
}