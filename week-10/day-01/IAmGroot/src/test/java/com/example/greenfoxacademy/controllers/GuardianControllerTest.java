package com.example.greenfoxacademy.controllers;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


import com.example.greenfoxacademy.IamgrootApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IamgrootApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void GrootEnd_WithQueryParam_ReceiveGrootGreet() throws Exception {
    mockMvc.perform(get("/groot?input=hello"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received").value("hello"))
        .andExpect(jsonPath("$.translated").value("I am Groot!"));
  }

  @Test
  public void GrootEnd_WithoutQueryParam_ReceiveErrorMessage() throws Exception {
    mockMvc.perform(get("/groot"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error").value("I am Groot!"));
  }

  @Test
  public void YunduEnd_TimeEqualsZero() throws Exception {
    mockMvc.perform(get("/yundu?distance=100.0&time=10.0"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.distance").value(100.0))
        .andExpect(jsonPath("$.time").value(10.0))
        .andExpect(jsonPath("$.speed").value(10.0));
  }

  @Test
  public void YunduEnd_WithoutQueryParam_ReceiveErrorMessage() throws Exception {
    mockMvc.perform(get("/yundu"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error").value("I am Groot!"));
  }

  @Test
  public void RocketEnd_getEmptyCargoStatus() throws Exception {
    mockMvc.perform(get("/rocket"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.caliber25").value(0))
        .andExpect(jsonPath("$.caliber30").value(0))
        .andExpect(jsonPath("$.caliber50").value(0))
        .andExpect(jsonPath("$.shipstatus").value("empty"))
        .andExpect(jsonPath("$.ready").value(false));
  }

  @Test
  public void RocketEnd_getCargoStatus() throws Exception {
   mockMvc.perform(get("/rocket/fill?caliber=.50&amount=5000"))
       .andExpect(status().isOk())
       .andExpect(jsonPath("$.received").value(".50"))
       .andExpect(jsonPath("$.amount").value(5000))
       .andExpect(jsonPath("$.shipstatus").value("40.0%"))
       .andExpect(jsonPath("$.ready").value(false));
  }

  @Test
  public void RocketEnd_OverLoadRorasCargo() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=15000"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error").value("Cannot load more than 12500 ammo to Rora's cargo"));
  }

  @Test
  public void RocketEnd_LoadingRorasCargo() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=5000"));
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=5000"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.shipstatus").value("80.0%"));
  }
}
