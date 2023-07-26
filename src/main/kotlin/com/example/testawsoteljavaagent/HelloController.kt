package com.example.testawsoteljavaagent

import org.slf4j.LoggerFactory
import org.slf4j.MDC
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicInteger

@RestController
class HelloController {

    private val log = LoggerFactory.getLogger(this::class.java)
    private val counter = AtomicInteger(1)

    @GetMapping("/hello")
    fun hello(): String {
        log.info("Hello called for the ${counter.getAndIncrement()} time")
        return "hello"
    }
}