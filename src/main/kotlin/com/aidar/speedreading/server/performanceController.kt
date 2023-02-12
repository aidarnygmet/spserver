package com.aidar.speedreading.server

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RequestMapping
@RestController
class performanceController(val service: performanceService) {
    @GetMapping
    fun getAllPerformance() = service.getAll()
    @GetMapping("/{id}")
    fun getPerformance(@PathVariable id: String) = service.getById(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun savePerformance(@RequestBody performance: performance): performance = service.create(performance)

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletePerformance(@PathVariable id: String) = service.remove(id)

    @PutMapping("/{id}")
    fun updatePerformance(
            @PathVariable id: String, @RequestBody performance: performance
    ) = service.update(id, performance)

}