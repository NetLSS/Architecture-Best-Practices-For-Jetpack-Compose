package com.example.unitconverterapp.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.unitconverterapp.ConverterViewModel

@Composable
fun BaseScreen(
    modifier: Modifier = Modifier,
    converterViewModel: ConverterViewModel = viewModel()
) {
    // 변하지 않으므로 State 로 둘 필요가 없다.
    val list = converterViewModel.getConversions()

    Column(modifier = modifier.padding(30.dp)) {
        TopScreen(list)
        Spacer(modifier = modifier.height(20.dp))
        HistoryScreen()
    }
}