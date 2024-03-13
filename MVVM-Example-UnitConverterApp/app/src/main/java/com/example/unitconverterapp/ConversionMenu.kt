package com.example.unitconverterapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun ConversionMenu(list: List<Conversion>, modifier: Modifier = Modifier) {

    var displayingText by remember {
        mutableStateOf("Select the conversion")
    }


}