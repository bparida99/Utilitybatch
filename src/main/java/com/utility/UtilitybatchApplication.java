package com.utility;

import com.utility.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.utility.kafka.consumer.MyConsumer;
import com.utility.kafka.producer.MessageProducer;

@SpringBootApplication
@EnableScheduling
public class UtilitybatchApplication {

	private static Properties p;
	
	boolean send = true;
	
	@Autowired
	private MessageProducer messageProducer;
	
	
	public UtilitybatchApplication(Properties p) {
		this.p =p;
	}

	public static void main(String[] args) {
		SpringApplication.run(UtilitybatchApplication.class, args);
		System.out.println(p.getEmail());
	}
	
	@Scheduled(fixedRate = 200)
	void print() throws InterruptedException {
		if(send) {
			System.out.println("BISWO working");
			send = false;
			messageProducer.sendNotification(new User(1,"Biswo"));
		}
		
	}

}
