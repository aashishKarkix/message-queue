package com.mq.rabbit.controller;

import com.mq.rabbit.service.MessageProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rabbit")
public class RabbitController {
  private final MessageProducer messageProducer;

  public RabbitController(MessageProducer messageProducer) {
    this.messageProducer = messageProducer;
  }

  @GetMapping
  public String sendMessage(@RequestParam("message") String message) {
    messageProducer.sendMessage(message);
    return "Message: " + message;
  }
}

