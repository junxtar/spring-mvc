package com.sparta.springmvc.response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ResponseRestController {

   @GetMapping("/json/string")
   public String helloStringJson() {
      return "{\"name\":\"Robbie\",\"age\":95}";
   }

   @GetMapping("/json/class")
   public Star helloClassJson() {
      return new Star("star", 2);
   }
}


