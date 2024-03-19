package com.example.unitconverterapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ConversionResult::class], version = 1)
abstract class ConverterDatabase : RoomDatabase() {

    abstract val converterDAO: ConverterDAO

    companion object {
        @Volatile
        private var INSTANCE: ConverterDatabase? = null

        fun getInstance(context: Context): ConverterDatabase {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    ConverterDatabase::class.java,
                    "converter_data_database"
                ).build().also { INSTANCE = it }
            }
        }
    }
}