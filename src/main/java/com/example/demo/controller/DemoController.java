package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping(path = "/time")
    public String time() {
        return Instant.now().toString();
    }
}
