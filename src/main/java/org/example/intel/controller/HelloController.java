package org.example.intel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hi")
    public String sayHi(Model model) {
        System.out.println(" sayHi() >>>>>>>>>>>>>>>>>>>>>>");
        model.addAttribute("message", "Hello");
        return "hitemplate";
    }
}
