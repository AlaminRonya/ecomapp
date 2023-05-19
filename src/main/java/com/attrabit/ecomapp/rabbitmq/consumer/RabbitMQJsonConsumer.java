package com.attrabit.ecomapp.rabbitmq.consumer;

import com.attrabit.ecomapp.rabbitmq.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public void jsonMessage(UserDTO dto){
        LOGGER.info(String.format("Received JSON message -> %s",dto));
    }
}
