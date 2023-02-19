package com.aidar.speedreading.server


import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import com.aidar.speedreading.server.model.performance

@SpringBootTest
class ServerApplicationTests {
	@Autowired
	lateinit var performanceDao: performanceDao

	@Test
	fun addPerformancesTest() {
		addPerformance(0, 0, 100, "2016-01-01")
		addPerformance(1, 1, 200, "2016-02-02")
		addPerformance(2, 2, 400, "2016-03-03")
		addPerformance(3, 3, 300, "2016-01-01")
	}
	fun addPerformance(exerciseId: Int, userId: Int, score: Int, date: String){
		val performance = performance(exerciseId, userId, score, date)
		performanceDao.save(performance)
	}

}
