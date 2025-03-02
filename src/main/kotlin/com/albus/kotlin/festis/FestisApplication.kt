package com.albus.kotlin.festis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class FestisApplication

fun main(args: Array<String>) {
	runApplication<FestisApplication>(*args)
}
