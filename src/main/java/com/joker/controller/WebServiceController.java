package com.joker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServiceController {
    @GetMapping(value = "/joker")
    public String joker(){
        return "Fica aí com tuas piadinhas1 ";
    }
}
