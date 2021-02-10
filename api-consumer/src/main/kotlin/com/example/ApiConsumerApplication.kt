package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
class ApiConsumerApplication

fun main(args: Array<String>) {
    runApplication<ApiConsumerApplication>(*args)
}
