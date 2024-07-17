package com.mq.rabbit.service;

import com.mq.rabbit.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

  @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
  public void receiveMessage(String message) {
    System.out.println("Received message:" + message);
  }
}
