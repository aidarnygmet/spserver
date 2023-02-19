package com.aidar.speedreading.server

import org.springframework.stereotype.Service
import com.aidar.speedreading.server.repo.performancRepository
import com.aidar.speedreading.server.model.performance
import org.springframework.beans.factory.annotation.Autowired

@Service
class performanceDao {
    @Autowired
    lateinit var repository: performancRepository

    fun save(performance: performance): performance{
        return repository.save(performance)
    }
    fun getAllperformance(): MutableIterable<performance> {
        return repository.findAll()
    }
    fun delete(id: Long){
        repository.deleteById(id)
    }
}