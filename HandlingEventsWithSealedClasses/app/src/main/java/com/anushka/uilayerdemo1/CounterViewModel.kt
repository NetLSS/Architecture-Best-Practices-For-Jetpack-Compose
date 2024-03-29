package com.anushka.uilayerdemo1

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class CounterViewModel : ViewModel() {

    private val _screenState = mutableStateOf(
        MainScreenState(
            inputValue = "",
            displayingResult = "Total is 0.0"
        )
    )

    val screenState: State<MainScreenState> = _screenState

    private val _uiEventFlow = MutableSharedFlow<UIEvent>()
    val uiEventFlow = _uiEventFlow.asSharedFlow()

    private var total = 0.0 // compose 에서 직접 사용하지 않기 때문에 state 를 사용하지 않는다.

    private fun addToTotal() {
        total += _screenState.value.inputValue.toDouble()
        _screenState.value = _screenState.value.copy(
            displayingResult = "Total is $total",
            isCountButtonVisible = false
        )
    }

    private fun resetTotal() {
        total = 0.0
        _screenState.value = _screenState.value.copy(
            displayingResult = "Total is $total",
            inputValue = "",
            isCountButtonVisible = false
        )
    }

    fun onEvent(event: CounterEvent) {
        when (event) {
            is CounterEvent.ValueEntered -> {
                _screenState.value = _screenState.value.copy(
                    inputValue = event.value,
                    isCountButtonVisible = true
                )
            }

            CounterEvent.CountButtonClick -> {
                addToTotal()
                viewModelScope.launch {
                    _uiEventFlow.emit(UIEvent.ShowMessage("Value added successfully"))
                }
            }

            CounterEvent.ResetButtonClick -> {
                resetTotal()
                viewModelScope.launch {
                    _uiEventFlow.emit(UIEvent.ShowMessage("Total reset successfully"))
                }
            }
        }
    }

}