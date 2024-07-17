package com.mq.nats.config;

import io.nats.client.Connection;
import io.nats.client.Nats;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class NatsConfig {

  @Value("${nats.server.host}")
  private String nastServer;
  @Value("${nats.server.port}")
  private int natsServerPort;

  @Bean(destroyMethod = "close")
  public Connection natsConnection() throws IOException, InterruptedException {
    return Nats.connect("nats://" + nastServer + ":" + natsServerPort);
  }
}
