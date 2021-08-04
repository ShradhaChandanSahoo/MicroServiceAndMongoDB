package com.shradha.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudFeignCourseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignCourseServiceApplication.class, args);
	}

}
