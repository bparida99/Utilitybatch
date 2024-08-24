package com.utility.kafka.producer;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import com.utility.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Value("${topic.name}")
    private String topicName;
    @Autowired
    private KafkaTemplate<String, User> template;

    private static final String TOPIC = "myFirstTopic";

    public void sendNotification(User user) {
        CompletableFuture<SendResult<String, User>> future =
                template.send(topicName, UUID.randomUUID().toString(),user);
        future.whenComplete((result, ex) -> {
            if (ex == null) {
                System.out.println("Sent message=[" + user +
                        "] with offset=[" + result.getRecordMetadata().offset() + "]");
            } else {
                System.out.println("Unable to send message=[" +
                        user + "] due to : " + ex.getMessage());
            }
        });
    }
}
