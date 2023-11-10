package com.albus.kotlin.festis.application.mapper

import com.albus.kotlin.festis.application.dto.response.PriceResponse
import com.albus.kotlin.festis.domain.model.Festivales


/**
 * Mapper del price
 */
object PriceMapper {

    /**
     * Mapeado de la entidad prices al response
     * @param prices
     * @return priceResponse
     */
    fun fromPricesToResponse(prices: Festivales): PriceResponse {
        return PriceResponse().apply {
            productId = prices.productId!!
            brandId = prices.brandId!!
            priceToApply = prices.priceList!!
            startDate = prices.startDate
            endDate = prices.endDate
            finalPrice = prices.price!!
        }
    }
}