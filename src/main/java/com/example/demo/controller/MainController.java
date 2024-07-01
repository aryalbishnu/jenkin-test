package com.example.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


  @GetMapping("/index")
  public String linkof(Model model) {
    return "index";
  }

  @GetMapping("/contact")
  public String contactOf(Model model) {
    return "message";
  }


}
