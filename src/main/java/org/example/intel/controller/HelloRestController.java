package org.example.intel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello() >>>>>>>>>>>>>>>>>>>>>>>>>");
        return "Hello StringZ!!!!!   ~~~~";
    }
}
