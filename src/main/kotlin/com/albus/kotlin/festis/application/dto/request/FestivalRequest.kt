package com.albus.kotlin.festis.application.dto.request

/**
 * Objeto request de festival
 */
data class FestivalRequest(
        var precio: Double,
        var nombre: String,
        var fama: Int
)
