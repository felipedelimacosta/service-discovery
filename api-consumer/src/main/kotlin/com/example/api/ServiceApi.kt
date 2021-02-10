package com.example.api

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient("service-api")
interface ServiceApi {

    @GetMapping("/api")
    fun hello(): String

    @PostMapping("/api/PingPong")
    fun pingPong(@RequestBody text: String):String


}