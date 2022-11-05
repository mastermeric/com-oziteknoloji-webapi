package com.oziteknoloji.webapi.controller;

import java.time.LocalDate;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    

    Logger myLogger = LogManager.getLogger(TestController.class);

    @GetMapping("test")
    public String test() {

        myLogger.log(Level.INFO, "--------------------------------");
        myLogger.log(Level.INFO, "OZITEKNOLOJI  -->>  TESTTTTT");
        myLogger.log(Level.INFO, "--------------------------------");
        
        return "OK..  " + LocalDate.now();
    }

}
