package com.crowdseats.showTime;

import com.crowdseats.framework.common.util.ProfileSetup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.crowdseats.framework.common.feign.clients")
public class ShowTimeServiceApplication {

	public static void main(String[] args) {
		System.setProperty("service.name", "showtime");
//		SpringApplication.run(ShowTimeServiceApplication.class, args);
		ProfileSetup.setupProfile(new SpringApplication(ShowTimeServiceApplication.class), args);
	}

}
