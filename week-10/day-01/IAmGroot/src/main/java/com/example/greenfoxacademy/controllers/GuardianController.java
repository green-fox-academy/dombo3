package com.example.greenfoxacademy.controllers;

import com.example.greenfoxacademy.exception.ExceptionMessage;
import com.example.greenfoxacademy.exception.OverLoadExceptionMessage;
import com.example.greenfoxacademy.exception.OverLoadRocketException;
import com.example.greenfoxacademy.model.CargoStatus;
import com.example.greenfoxacademy.model.DraxCalorieTable;
import com.example.greenfoxacademy.model.DraxFood;
import com.example.greenfoxacademy.model.GrootGreet;
import com.example.greenfoxacademy.model.RocketShipRora;
import com.example.greenfoxacademy.model.YundusArrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @Autowired
  RocketShipRora rocketShipRora;

  @Autowired
  DraxCalorieTable draxCalorieTable;

  @GetMapping("/groot")
  public GrootGreet greet(@RequestParam String input) {
    return new GrootGreet(input);
  }

  @GetMapping("/yundu")
  public YundusArrow shootArrow(@RequestParam float distance, @RequestParam float time) {
    YundusArrow yundusArrow = new YundusArrow(distance,time);
    yundusArrow.calculateSpeed();
    return yundusArrow;
  }

  @GetMapping("/rocket")
  public RocketShipRora roraStatus() {
    return this.rocketShipRora;
  }

  @GetMapping("/rocket/fill")
  public CargoStatus fillCargo(@RequestParam String caliber, @RequestParam int amount) throws Exception {
    rocketShipRora.fillCaliber(caliber,amount);
    return rocketShipRora.getStatus(caliber,amount);
  }

  @GetMapping("/drax")
  public DraxCalorieTable getDraxCalorieTable() {
    return draxCalorieTable;
  }

  @GetMapping("/drax/add")
  public DraxFood addDraxFood(@RequestParam String name, @RequestParam double amount, @RequestParam double calorie) {
    DraxFood draxFood = new DraxFood(name,amount,calorie);
    draxCalorieTable.add(draxFood);
    return draxFood;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ExceptionMessage GuradianException() {
    return new ExceptionMessage("I am Groot!");
  }

  @ExceptionHandler(OverLoadRocketException.class)
  public OverLoadExceptionMessage OverLoadRocketException() {
    return new OverLoadExceptionMessage("Cannot load more than 12500 ammo to Rora's cargo");
  }
}
