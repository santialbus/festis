package com.albus.kotlin.festis.infrastructure.repository

import com.albus.kotlin.festis.domain.model.Festivales
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.*

/**
 * Repositorio del price
 */
@Repository
interface FestivalesRepository : JpaRepository<Festivales, Long> {

    @Query("SELECT f FROM Festivales f " +
            "WHERE " +
            "AND f.fama = :fama " +
            "AND f.name = :name" +
            "AND f.precio = :precio;")
    fun findByFamaAndNombreAndPrecio(
            @Param("fama") fama: Int,
            @Param("name") name: String,
            @Param("precio") precio: Double
    ): Optional<Festivales>
}