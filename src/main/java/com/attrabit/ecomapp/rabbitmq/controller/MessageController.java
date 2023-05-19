package com.attrabit.ecomapp.rabbitmq.controller;

import com.attrabit.ecomapp.rabbitmq.publisher.RabbitMQProducer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageController {
    private RabbitMQProducer rabbitMQProducer;

    public MessageController(RabbitMQProducer rabbitMQProducer) {
        this.rabbitMQProducer = rabbitMQProducer;
    }
    @GetMapping("/publish")
    public ResponseEntity<?> sendMessage(@RequestParam("message") String message) {
        rabbitMQProducer.sendMessage(message);
        return new ResponseEntity<>("Message sent to RabbitMQ...", HttpStatus.OK);
    }
}
