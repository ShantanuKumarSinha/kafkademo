package com.example.kafka.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service

public class ConsumerService {

    Logger log = LoggerFactory.getLogger(ConsumerService.class);


    @KafkaListener(topics = "KafkaDemoTopics", groupId ="KafkaDemoGroup" )
    public void listenKafkaMessage(String messageRecieved){
        System.out.println("The message received is "+messageRecieved);
        log.info(messageRecieved);


    }

}
