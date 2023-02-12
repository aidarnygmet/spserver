package com.aidar.speedreading.server

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Table
import org.springframework.data.annotation.Id

@Entity
@Table(name = "performance")
data class performance (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: String,
    val exercise: Int,
    val point:Int,
    val date:String


)