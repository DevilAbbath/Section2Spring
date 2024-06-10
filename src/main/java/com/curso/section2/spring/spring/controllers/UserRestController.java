package com.curso.section2.spring.spring.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.section2.spring.spring.models.User;
import com.curso.section2.spring.spring.models.dto.UserDto;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class UserRestController {

   @GetMapping("/details")
   public UserDto details() {
      User user = new User("Erick", "Jaime");
      UserDto userDto = new UserDto();

      /*
       * Without DTO
       * Map<String, Object> body = new HashMap<>();
       * 
       * body.put("title", "Details");
       * body.put("user", user);
       */

      /* With DTO */
      userDto.setUser(user);
      userDto.setTitle("Details");

      return userDto;
   }

   @GetMapping("/list")
   public List<User> list() {
      User user = new User("Erick", "Jaime");
      User user2 = new User("Esteban", "Jara");
      User user3 = new User("Eduardo", "Jair");

      /* Abreviation */
      List<User> users = Arrays.asList(user, user2, user3);

      /*
       * Desgloce
       * List<User> users = new ArrayList<>();
       * users.add(user);
       * users.add(user2);
       * users.add(user3);
       */

      return users;
   }

}
