package com.oldlane.myapiinterface;

import com.oldlane.myapiclientsdk.client.MyApiClient;
import com.oldlane.myapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MyapiInterfaceApplicationTests {

	@Resource
	private MyApiClient myApiClient;

	@Test
	void contextLoads() {
		String oldlane = myApiClient.getNameByGet("oldlane");
		User user = new User();
		user.setUsername("oldlane");
		String usernameByPost = myApiClient.getUsernameByPost(user);
		System.out.println(oldlane);
		System.out.println(usernameByPost);
	}

}
