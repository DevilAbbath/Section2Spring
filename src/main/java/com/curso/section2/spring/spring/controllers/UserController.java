package com.curso.section2.spring.spring.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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

   @GetMapping("/list")
   public String list(ModelMap model) {
      model.addAttribute("title", "Users List");
      return "list";
   }

   @ModelAttribute("users")
   public List<User> usersModel() {
      return Arrays.asList(
            new User("Erick", "Jaime", "ejaime@domain.com"),
            new User("East", "Weston"),
            new User("Denis", "Smith"));
   }

}
