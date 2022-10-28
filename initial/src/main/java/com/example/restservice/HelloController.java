package com.example.restservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/whois/{id}")
    public String index(@PathVariable String id) {
        if (id.equals("dima")) {
            return "THE BEST! AND I KNOW IT(❁´◡`❁)";
        } else return "is the good!";
    }

    @GetMapping("*")
    public String index2() {
        return "don't work";
    }
}
