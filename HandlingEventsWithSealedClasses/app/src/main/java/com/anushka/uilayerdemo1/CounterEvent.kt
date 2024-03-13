package com.anushka.uilayerdemo1

sealed class CounterEvent {
    data class ValueEntered(val value: String) : CounterEvent()
    object CountButtonClick : CounterEvent()
    object ResetButtonClick : CounterEvent()
//    object Increment : CounterEvent()
//    object Decrement : CounterEvent()
//    object Reset : CounterEvent()
//    data class Error(val message: String) : CounterEvent()
}