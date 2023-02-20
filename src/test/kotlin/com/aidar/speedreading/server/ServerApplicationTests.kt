package com.aidar.speedreading.server


import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import com.aidar.speedreading.server.model.performance
import com.aidar.speedreading.server.model.users

@SpringBootTest
class ServerApplicationTests {
	@Autowired
	lateinit var usersDao: usersDao

	@Test
	fun addUsersTest() {
		addPerformance("user1", "1111", "2016-01-01", "2016-01-01")
		addPerformance("user2", "1112", "2016-01-01", "2016-01-01")
		addPerformance("user3", "1113", "2016-01-01", "2016-01-01")
		addPerformance("user1", "1114", "2016-01-01", "2016-01-01")
	}
	fun addPerformance(username: String, password: String, created_on: String, last_login: String){
		val users = users(username, password, created_on, last_login)
		usersDao.save(users)
	}

}
