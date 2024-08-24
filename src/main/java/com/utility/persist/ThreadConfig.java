package com.utility.persist;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class ThreadConfig {

	@Bean(name = "threadPoolTaskExecutor")
	Executor threadPoolTaskExecutor() {
		   ThreadPoolTaskExecutor t = new ThreadPoolTaskExecutor();
		   t.setCorePoolSize(5);
		   t.setMaxPoolSize(300);
		   t.setQueueCapacity(4000);
		   System.out.println();
	       return new ThreadPoolTaskExecutor();
	   }
}
