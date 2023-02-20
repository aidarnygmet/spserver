package com.aidar.speedreading.server.repo

import com.aidar.speedreading.server.model.performance
import com.aidar.speedreading.server.model.users
import org.springframework.data.repository.CrudRepository

interface usersRepository: CrudRepository<users, Long> {
}