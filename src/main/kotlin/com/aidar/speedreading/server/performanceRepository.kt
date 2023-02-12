package com.aidar.speedreading.server

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface performanceRepository : CrudRepository<performance, String>