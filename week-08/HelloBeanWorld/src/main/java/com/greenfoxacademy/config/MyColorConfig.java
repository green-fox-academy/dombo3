package com.greenfoxacademy.config;

import com.greenfoxacademy.model.BlueColor;
import com.greenfoxacademy.model.MyColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyColorConfig {
  @Bean
  public MyColor myColor() {
    return new BlueColor();
  }
}
