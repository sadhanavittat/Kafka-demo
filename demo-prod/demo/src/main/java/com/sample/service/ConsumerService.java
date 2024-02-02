package com.sample.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

     @KafkaListener(topics = "order-updtes",groupId = "demo")
    public void printOrderUpdates(String message){
        System.out.println("Order Update:- " + message);
    }
    
}
