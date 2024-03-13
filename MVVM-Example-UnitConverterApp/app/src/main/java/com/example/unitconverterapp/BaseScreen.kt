package com.example.unitconverterapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun BaseScreen(
    modifier: Modifier = Modifier,
    converterViewModel: ConverterViewModel = viewModel()
) {
    // 변하지 않으므로 State 로 둘 필요가 없다.
    val list = converterViewModel.getConversions()
}