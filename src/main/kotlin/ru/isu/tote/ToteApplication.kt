package ru.isu.tote

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ToteApplication

fun main(args: Array<String>) {
	runApplication<ToteApplication>(*args)
}
