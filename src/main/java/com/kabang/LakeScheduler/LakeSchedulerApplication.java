package com.kabang.LakeScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LakeSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LakeSchedulerApplication.class, args);
	}
}
