package com.curso.section2.spring.spring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.section2.spring.spring.models.User;
import com.curso.section2.spring.spring.models.dto.ParamDto;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

   @Value("${config.name}")
   private String name;

   @Value("${config.code}")
   private Integer code;

   @Value("${config.message}")
   private String message;

   @Value("${config.lov}")
   private String[] lov;

   @GetMapping("/baz/{message}")
   public ParamDto baz(@PathVariable() String message) {

      ParamDto param = new ParamDto();
      param.setMessage(message);
      return param;
   }

   @GetMapping("/mix/{product}/{id}")
   public Map<String, Object> mixPathVar(@PathVariable String product, @PathVariable Long id) {

      Map<String, Object> json = new HashMap<>();
      json.put("product", product);
      json.put("id", id);

      return json;
   }

   @PostMapping("/create")
   public User create(@RequestBody User user) {

      return user;
   }

   @GetMapping("/values")
   public Map<String, Object> values() {

      Map<String, Object> json = new HashMap<>();
      json.put("name", name);
      json.put("code", code);
      json.put("message", message);
      json.put("lov", lov);

      return json;
   }
}
