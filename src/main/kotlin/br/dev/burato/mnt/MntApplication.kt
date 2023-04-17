package br.dev.burato.mnt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MntApplication

fun main(args: Array<String>) {
	runApplication<MntApplication>(*args)
}
