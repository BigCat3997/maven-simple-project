package com.bigcat3997.simple_project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("/version")
    public String getMethodName() {
        return "1.0.0";
    }
}
