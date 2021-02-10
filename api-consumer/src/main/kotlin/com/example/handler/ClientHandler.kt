package com.example.handler

import com.example.api.ServiceApi
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class ClientHandler(
    private val serviceApi: ServiceApi
){
    private val log = LoggerFactory.getLogger(ClientHandler::class.java)

    @Scheduled(fixedDelay = 5_000, initialDelay = 10_000)
    fun caller(){
        log.info(serviceApi.hello())
        log.info(serviceApi.pingPong("ping"))
        log.info(serviceApi.pingPong("pong"))
    }
}