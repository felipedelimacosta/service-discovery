package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class ServiceApiApplication

fun main(args: Array<String>) {
    runApplication<ServiceApiApplication>(*args)
}
