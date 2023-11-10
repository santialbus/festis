package com.albus.kotlin.festis.application.controller


import com.albus.kotlin.festis.application.dto.response.PriceResponse
import com.albus.kotlin.festis.application.dto.request.FestivalRequest
import com.albus.kotlin.festis.application.service.FestivalesService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/prices")
class PricesController(private val pricesService: FestivalesService) {

    /**
     * Metodo de consulta de precios
     * @param request
     * @return calculatedPrice
     */
    @PostMapping("/consulta")
    fun consultarPrecio(@RequestBody request: FestivalRequest): ResponseEntity<PriceResponse> {
        return ResponseEntity(pricesService.consultaDatos(request), HttpStatus.OK)
    }

    /**
     * Anyadir los prices dado que desde el sql creado peta
     * @return String, HttpStatus
     */
    @PostMapping("/anyadir")
    fun anyadirPrices(): ResponseEntity<String> {
        return ResponseEntity(pricesService.anyadirPrices(), HttpStatus.OK)
    }
}