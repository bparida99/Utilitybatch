package com.utility.kafka.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.utility.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyConsumer {

    @KafkaListener(topics = "${topic.name}")
    public void read(ConsumerRecord<String, User> consumerRecord) {
        String key = consumerRecord.key();
        User user = consumerRecord.value();
        log.info("Avro message received for key : " + key + " value : " + user.toString());

    }


}
