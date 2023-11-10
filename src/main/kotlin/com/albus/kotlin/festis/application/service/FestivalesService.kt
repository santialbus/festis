package com.albus.kotlin.festis.application.service

import com.albus.kotlin.festis.application.dto.request.FestivalRequest
import com.albus.kotlin.festis.application.dto.response.FestivalResponse

/**
 * Interfaz del service de price
 */
interface FestivalesService {
    fun consultaDatos(festivalRequest: FestivalRequest): FestivalResponse
    fun anyadirFestis(): String
}