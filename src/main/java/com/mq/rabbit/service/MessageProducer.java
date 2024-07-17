package com.mq.rabbit.service;

import com.mq.rabbit.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {
  private final RabbitTemplate rabbitTemplate;

  public MessageProducer(RabbitTemplate rabbitTemplate) {
    this.rabbitTemplate = rabbitTemplate;
  }

  public void sendMessage(String message) {
    rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE_NAME, message);
    System.out.println("send message: " + message);
  }
}
