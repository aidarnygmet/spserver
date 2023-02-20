package com.aidar.speedreading.server.controller

import com.aidar.speedreading.server.model.performance
import com.aidar.speedreading.server.model.users
import com.aidar.speedreading.server.performanceDao
import com.aidar.speedreading.server.usersDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class usersController {
    @Autowired
    lateinit var usersDao: usersDao
    @PostMapping("/users/save")
    fun save(@RequestBody users: users): users {
        return usersDao.save(users)
    }
    @GetMapping("/users/get")
    fun getAllperformance(): MutableIterable<users> {
        return usersDao.getAllperformance()
    }
}