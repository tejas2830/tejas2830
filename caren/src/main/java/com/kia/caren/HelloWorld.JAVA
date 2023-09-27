package com.kia.caren;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class helloword { 

    @GetMapping(path = "/")
    public String hi(){ 

      return "Hi, Welcome To Kia Caren"; 

    } 

     

}