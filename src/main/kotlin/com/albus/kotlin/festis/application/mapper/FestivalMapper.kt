package com.albus.kotlin.festis.application.mapper

import com.albus.kotlin.festis.application.dto.response.FestivalResponse
import com.albus.kotlin.festis.domain.model.Festivales


/**
 * Mapper del festival
 */
object FestivalMapper {

    /**
     * Mapeado de la entidad festivales al response
     * @param festis
     * @return festivalResponse
     */
    fun fromFestivalesToResponse(festis: Festivales): FestivalResponse {
        return FestivalResponse(festis.precio,
            festis.nombre,
            festis.fama,
            festis.id)
    }
}