package com.greenfoxacademy.controllers;

import com.greenfoxacademy.Greeting;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

  AtomicLong id = new AtomicLong();
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  int[] fonts = {30, 24, 45, 66};
  String[] colors = {"blue", "yellow", "green", "purple"};

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(value = "name", defaultValue = "World", required = false) String name) {

    List<Greeting> greetings = new ArrayList<>();
    for (String hello : hellos) {
      greetings.add(new Greeting(id.incrementAndGet(),hello,getRandomColor(),getRandomSize()));
    }

    model.addAttribute("name", name);
    model.addAttribute("counter", id.incrementAndGet());
    model.addAttribute("greetings", greetings);
    return "greeting";
  }

  public String getRandomColor() {
    Random rand = new Random();
    int r = rand.nextInt(255);
    int g = rand.nextInt(255);
    int b = rand.nextInt(255);
    return "rgb(" + r + "," + g + "," + b + ")";
  }

  public int getRandomSize() {
    int rand = (int) (Math.random() * 100) + 8;
    return rand;
  }
}
