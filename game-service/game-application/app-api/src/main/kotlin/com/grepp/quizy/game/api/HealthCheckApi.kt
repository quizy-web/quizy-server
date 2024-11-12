package com.grepp.quizy.game.api

import com.grepp.quizy.common.api.ApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckApi {
    @GetMapping("/health")
    fun healthCheck(): ApiResponse<Void> {
        return ApiResponse.success("I'm GAME service")
    }
}
