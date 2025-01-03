package com.talvio.job_seeker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JobSeekerApp {

	public static void main(String[] args) {
		SpringApplication.run(JobSeekerApp.class, args);
	}

}
