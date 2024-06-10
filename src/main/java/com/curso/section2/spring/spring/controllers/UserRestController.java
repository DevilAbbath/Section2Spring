package com.curso.section2.spring.spring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.section2.spring.spring.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

   @GetMapping("/details")
   public Map<String, Object> details() {
      User user = new User("Erick", "Jaime");
      Map<String, Object> body = new HashMap<>();

      body.put("title", "Details");
      body.put("user", user);

      return body;
   }

}
