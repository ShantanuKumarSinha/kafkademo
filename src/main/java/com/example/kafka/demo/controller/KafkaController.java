package com.example.kafka.demo.controller;

import com.example.kafka.demo.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafkaDemo/api")
public class KafkaController {

    @Autowired
    ProducerService producerService;

    @GetMapping("/produceMsg")
    public void getMessageFromClient(@RequestParam("message") String message){
        producerService.sendMsgToTopics(message);
    }
}
