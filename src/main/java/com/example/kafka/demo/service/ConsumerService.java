package com.example.kafka.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {


    @KafkaListener(topics = "KafkaDemoTopics", groupId ="KafkaDemoGroup" )
    public void listenKafkaMessage(String messageRecieved){
        System.out.println("The message received is "+messageRecieved);
    }

}
