package com.mq.nats.service;

import io.nats.client.Connection;
import org.springframework.stereotype.Service;

@Service
public class NatsProducer {

  private final Connection connection;

  public NatsProducer(Connection connection) {
    this.connection = connection;
  }

  public void sendMessage(String subject, String message) {
    try {
      connection.publish(subject, message.getBytes());
      System.out.println("Send Message:" + message);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
