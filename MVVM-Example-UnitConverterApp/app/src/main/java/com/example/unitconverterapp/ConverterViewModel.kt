package com.example.unitconverterapp

import androidx.lifecycle.ViewModel

class ConverterViewModel : ViewModel() {

    fun getConversions() = listOf(
        Conversion(
            id = 1,
            description = "Pounds to Kilograms",
            convertFrom = "lbs",
            convertTo = "kg",
            multiplyBy = 0.453592
        ),
        Conversion(
            id = 2,
            description = "Kilograms to Pounds",
            convertFrom = "kg",
            convertTo = "lbs",
            multiplyBy = 2.20462
        ),
        Conversion(
            id = 3,
            description = "Yards to Meters",
            convertFrom = "yd",
            convertTo = "m",
            multiplyBy = 0.9144
        ),
        Conversion(
            id = 4,
            description = "Meters to Yards",
            convertFrom = "m",
            convertTo = "yd",
            multiplyBy = 01.09361
        ),
        Conversion(
            id = 5,
            description = "Miles to Kilometers",
            convertFrom = "mi",
            convertTo = "km",
            multiplyBy = 1.60934
        ),
        Conversion(
            id = 6,
            description = "Kilometers to Miles",
            convertFrom = "km",
            convertTo = "mi",
            multiplyBy = 0.621371
        ),
    )

}