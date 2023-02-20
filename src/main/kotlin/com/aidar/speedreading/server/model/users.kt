package com.aidar.speedreading.server.model

import jakarta.persistence.*

@Entity
@Table(name = "users")
class users (


    @Column(name = "username")
    val username: String,
    @Column(name = "password")
    val password: String,
    @Column(name = "created_on")
    val created_on: String,
    @Column(name = "last_login")
    val last_login: String,
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence-generator")
    @SequenceGenerator(
        name = "sequence-generator",
        sequenceName = "the_sequence_name"
    )
    @Column(name = "user_id")
    val user_id: Long = -1


    )