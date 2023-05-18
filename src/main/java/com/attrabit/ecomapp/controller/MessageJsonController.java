package com.attrabit.ecomapp.controller;

import com.attrabit.ecomapp.dto.UserDTO;
import com.attrabit.ecomapp.publisher.RabbitMQJsonProducer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageJsonController {
    private RabbitMQJsonProducer rabbitMQJsonProducer;

    public MessageJsonController(RabbitMQJsonProducer rabbitMQJsonProducer) {
        this.rabbitMQJsonProducer = rabbitMQJsonProducer;
    }



    @PostMapping("/publish")
    public ResponseEntity<?> sendJsonMessage(@RequestBody UserDTO dto){
        rabbitMQJsonProducer.sendJsonMessage(dto);
        return new ResponseEntity<>("Json message sent to RabbitMQ...", HttpStatus.OK);
    }
}
