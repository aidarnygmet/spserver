package com.aidar.speedreading.server

import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class performanceService(val repository: performanceRepository) {
    fun getAll(): MutableIterable<performance> = repository.findAll()
    fun getById(id: String): performance = repository.findByIdOrNull(id) ?:
    throw ResponseStatusException(HttpStatus.NOT_FOUND)
    fun create(performance: performance): performance = repository.save(performance)
    fun remove(id: String){
        if(repository.existsById(id)) repository.deleteById(id)
        else throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }
    fun update(id: String, performance: performance): performance {
        return if (repository.existsById(id)) {
            performance.id = id
            repository.save(performance)
        } else throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }
}