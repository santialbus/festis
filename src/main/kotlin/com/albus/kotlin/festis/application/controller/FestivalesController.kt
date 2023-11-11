package com.albus.kotlin.festis.application.controller


import com.albus.kotlin.festis.application.dto.request.FestivalRequest
import com.albus.kotlin.festis.application.dto.response.FestivalResponse
import com.albus.kotlin.festis.application.service.FestivalesService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/festivales")
class FestivalesController(private val festivalesService: FestivalesService) {

    /**
     * Metodo de consulta de festivales
     * @param request
     * @return calculatedPrice
     */
    @PostMapping("/consulta")
    fun consultarPrecio(@RequestBody request: FestivalRequest): ResponseEntity<FestivalResponse> {
        return ResponseEntity(festivalesService.consultaDatos(request), HttpStatus.OK)
    }

    /**
     * Anyadir los prices dado que desde el sql creado peta
     * @return String, HttpStatus
     */
    @PostMapping("/anyadir")
    fun anyadirPrices(): ResponseEntity<String> {
        return ResponseEntity(festivalesService.anyadirFestis(), HttpStatus.OK)
    }
}