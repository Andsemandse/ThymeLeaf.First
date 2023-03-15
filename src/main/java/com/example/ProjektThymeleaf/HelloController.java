package com.example.ProjektThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("hello")
public class HelloController {

    @GetMapping("say")
    public String sayHello(@RequestParam String name, Model model) {
        model.addAttribute("Yo", "Hello" + " " + name);
        return "hello";

    }

}

//http://localhost:8080/hello/say?name=Andreas
