package com.aidar.speedreading.server.controller
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.beans.factory.annotation.Autowired
import com.aidar.speedreading.server.model.performance
import com.aidar.speedreading.server.performanceDao
import com.aidar.speedreading.server.repo.performancRepository
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam

@RestController
class performanceController {
    @Autowired
    lateinit var performanceDao: performanceDao
    @PostMapping("/performance/save")
    fun save(@RequestBody performance: performance): performance {
        return performanceDao.save(performance)
    }
    @GetMapping("/performance/get")
    fun getAllperformance(): MutableIterable<performance> {
        return performanceDao.getAllperformance()
    }


}