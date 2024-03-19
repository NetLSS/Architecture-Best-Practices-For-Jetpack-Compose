package com.example.unitconverterapp.data

import kotlinx.coroutines.flow.Flow

class ConverterRepositoryImpl(
    private val dao: ConverterDAO
) : ConverterRepository {
    override suspend fun insertResult(result: ConversionResult) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteResult(result: ConversionResult) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAllResults() {
        TODO("Not yet implemented")
    }

    override fun getSavedResult(): Flow<List<ConversionResult>> {
        TODO("Not yet implemented")
    }

}