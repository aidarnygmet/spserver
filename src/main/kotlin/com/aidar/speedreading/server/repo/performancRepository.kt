package com.aidar.speedreading.server.repo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import com.aidar.speedreading.server.model.performance

interface performancRepository:  CrudRepository<performance, Long>{

}