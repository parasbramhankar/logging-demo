package com.example.logging_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class LogController {

    private static final Logger logger=Logger.getLogger(LogController.class.getName());

    @GetMapping
    public List<String>getAllUsers(){
        logger.info("Getting all data");
        return List.of("Paras","paras","paras","paras","paras");
    }

}
