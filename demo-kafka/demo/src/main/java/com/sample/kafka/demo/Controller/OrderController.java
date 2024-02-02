package com.sample.kafka.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.kafka.demo.Service.OrderService;

@RestController
@RequestMapping("/orders")

public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/sent")
    public ResponseEntity<?> orderProduce(String msg){

        orderService.sendMessage(msg);
        return ResponseEntity.ok("message succesfully delevered!!");
    }
    
}
