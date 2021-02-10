package com.example

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class HomeController {

    @GetMapping
    fun hello() = "Hello!!"

    @PostMapping("PingPong")
    fun pingPong(@RequestBody text: String): String {
        val parsedText = text.trim().toLowerCase()

        when (parsedText) {
            "ping" -> {
                return "pong"
            }
            "pong" -> {
                return "ping"
            }
            else -> {
                return text
            }
        }
    }
}