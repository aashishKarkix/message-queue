package com.mq.nats.controller;

import com.mq.nats.service.NatsProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nats")
public class NatsController {
  private final NatsProducer natsProducer;

  public NatsController(NatsProducer natsProducer) {
    this.natsProducer = natsProducer;
  }

  @GetMapping
  public String publishMessage(@RequestParam("message") String message) {
    natsProducer.sendMessage("nats.demo", message);
    return "Message from Nats: " + message;
  }
}
