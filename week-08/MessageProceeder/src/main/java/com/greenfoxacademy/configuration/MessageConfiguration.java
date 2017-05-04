package com.greenfoxacademy.configuration;

import com.greenfoxacademy.MessageProceeder;
import com.greenfoxacademy.service.EmailService;
import com.greenfoxacademy.service.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {
  @Bean
  public MessageService messageService() {
    return new EmailService();
  }

  @Bean
  public MessageProceeder messageProceeder() {
    return new MessageProceeder();
  }
}
