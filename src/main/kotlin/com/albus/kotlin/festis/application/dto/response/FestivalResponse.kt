package com.albus.kotlin.festis.application.dto.response

/**
 * Objeto response de price
 */
data class FestivalResponse(
        var precio: Double,
        var nombre: String,
        var fama: Int,
        var id: Long
)