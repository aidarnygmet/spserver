package com.aidar.speedreading.server.model
import jakarta.persistence.*

@Entity
@Table(name = "performance")
class performance(
    @Column(name = "exercise_id")
    val exerciseId: Int,
    @Column(name = "user_id")
    val userId: Int,
    @Column(name = "score")
    val score: Int,
    @Column(name = "date")
    val date: String,
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence-generator")
    @SequenceGenerator(
        name = "sequence-generator",
        sequenceName = "the_sequence_name"
    )
    @Column(name = "entry_id")
    val entry_id: Long = -1
)
