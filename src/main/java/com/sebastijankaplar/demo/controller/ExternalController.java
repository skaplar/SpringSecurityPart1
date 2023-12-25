package com.sebastijankaplar.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/external/hello")
public class ExternalController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String hello() {
        return "HELLO Externally!";
    }

}
