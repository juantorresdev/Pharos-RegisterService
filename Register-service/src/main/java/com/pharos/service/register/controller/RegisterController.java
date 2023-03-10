package com.pharos.service.register.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    
    Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @PostMapping(path="/register", consumes="application/json", produces="application/json")
    public void register() {
        
    }


}
