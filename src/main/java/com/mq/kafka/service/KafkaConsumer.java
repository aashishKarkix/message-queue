package com.mq.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

  @KafkaListener(topics = "example-topic", groupId = "group_id")
  public void consume(String message) {
    System.out.println("consumed message: " + message);
  }
}
