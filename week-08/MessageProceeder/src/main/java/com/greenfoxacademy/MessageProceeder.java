package com.greenfoxacademy;

import com.greenfoxacademy.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {
  @Autowired
  MessageService messageService;

  public String processMessage(String message, String email){
    return messageService.send(message,email);
  }
}
