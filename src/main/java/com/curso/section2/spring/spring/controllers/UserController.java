package com.curso.section2.spring.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.curso.section2.spring.spring.models.User;

@Controller
public class UserController {

   @GetMapping("/details")
   public String details(Model model) {

      User user = new User("Erick", "Jaime");
      model.addAttribute("title", "Details");
      model.addAttribute("user", user);

      return "details";
   }

}
