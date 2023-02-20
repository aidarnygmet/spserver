package com.aidar.speedreading.server

import com.aidar.speedreading.server.model.users
import com.aidar.speedreading.server.repo.performancRepository
import com.aidar.speedreading.server.repo.usersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class usersDao {
    @Autowired
    lateinit var repository: usersRepository

    fun save(users: users): users {
        return repository.save(users)
    }
    fun getAllperformance(): MutableIterable<users> {
        return repository.findAll()
    }
    fun delete(id: Long){
        repository.deleteById(id)
    }

}