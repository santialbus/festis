package com.albus.kotlin.festis.domain.model

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor

/**
 * Objeto entity del festivales
 */
@Entity
@Table(name = "festivales")
@NoArgsConstructor
@AllArgsConstructor
data class Festivales(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        var id: Long,

        @Column(name = "name")
        var name: String,

        @Column(name = "fama")
        var fama: Int,

        @Column(name = "precio")
        var precio: Double

)
