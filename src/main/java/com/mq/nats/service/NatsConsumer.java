package com.mq.nats.service;

import io.nats.client.Connection;
import io.nats.client.Dispatcher;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.nio.charset.StandardCharsets;

@Service
public class NatsConsumer {

  private final Connection connection;

  public NatsConsumer(Connection connection) {
    this.connection = connection;
  }

  @PostConstruct
  public void init() {
    try {
      Dispatcher dispatcher = connection.createDispatcher((msg) -> {
        String message = new String(msg.getData(), StandardCharsets.UTF_8);
        System.out.println("Received message: " + message);
      });

      dispatcher.subscribe("nats.demo");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
