package com.example.calculator.controller;

import com.example.calculator.service.CalcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String getHello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String sum(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
          return String.format("%d + %d = %d", a, b, this.calcService.sum(a, b));
    } //по условию строка должна формироваться в контроллере

    @GetMapping("/minus")
    public String dif(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return String.format("%d - %d = %d", a, b, this.calcService.differ(a, b));
    }

    @GetMapping("/multiply")
    public String mult(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return String.format("%d * %d = %d", a, b, this.calcService.mult(a, b));
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return String.format("%d / %d = %d", a, b, this.calcService.divide(a, b));
    }
}
