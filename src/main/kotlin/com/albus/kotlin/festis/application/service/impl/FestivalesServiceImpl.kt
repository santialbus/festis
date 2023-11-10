package com.albus.kotlin.festis.application.service.impl

import com.albus.kotlin.festis.application.dto.request.FestivalRequest
import com.albus.kotlin.festis.application.dto.response.FestivalResponse
import com.albus.kotlin.festis.application.mapper.PriceMapper
import com.albus.kotlin.festis.application.service.FestivalesService
import com.albus.kotlin.festis.domain.model.Festivales
import com.albus.kotlin.festis.infrastructure.exceptions.PriceNotFoundException
import com.albus.kotlin.festis.infrastructure.repository.PricesRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

/**
 * Service impl de la clase price
 */
@Service
class FestivalesServiceImpl(private val repository: PricesRepository) : FestivalesService {

    companion object {
        const val ANYADIDO = "Acabas de añadir productos"
    }

    private val logger: Logger = LoggerFactory.getLogger(FestivalesServiceImpl::class.java)

    /**
     * Consulta de datos
     * @param priceRequest
     * @return PriceResponse
     */
    override fun consultaDatos(festivalRequest: FestivalRequest): FestivalResponse {
        logger.info("Consultar datos de la fama: ${festivalRequest.fama}, nombre: ${festivalRequest.nombre}, precio: ${festivalRequest.precio}")

        return repository.findByFamaAndNombreAndPrecio(festivalRequest.fama, festivalRequest.nombre, festivalRequest.precio)
                .map { PriceMapper.fromPricesToResponse(it) }
                .orElseThrow {
                    logger.error("No se encontró fama: ${festivalRequest.fama}, nombre: ${festivalRequest.nombre}, precio: ${festivalRequest.precio}")
                    PriceNotFoundException("No se encontró ningún festival con los datos proporcionados")
                }
    }

    /**
     * Metodo de añadir prices
     * @return String
     */
    override fun anyadirFestis(): String {
        val listFestis: List<Festivales> = listOf(
                Festivales().apply {
                    id = 1L
                    name = "VinyaRock"
                    precio = 1.0
                    fama = 1
                },
                Festivales().apply {
                    name = "VinyaRock"
                    precio = 1.0
                    fama = 1
                },
                Festivales().apply {
                    name = "VinyaRock"
                    precio = 1.0
                    fama = 1
                },
                Festivales().apply {
                    name = "VinyaRock"
                    precio = 1.0
                    fama = 1
                }
        )

        repository.saveAll(listFestis)
        return ANYADIDO
    }
}