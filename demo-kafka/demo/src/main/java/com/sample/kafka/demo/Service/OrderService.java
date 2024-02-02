package com.sample.kafka.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class OrderService {
    
    @Autowired
    KafkaTemplate<String,Object> kafkaTemplate;


   

    public boolean sendMessage(String msg){

        kafkaTemplate.send("order-updtes", msg );
        return true;
    }
}
