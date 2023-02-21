package com.example.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.configuration.service.DateUtil;

@RestController
@RequestMapping("/")
public class testController {
    @Autowired
    DateUtil dateUtil;
    @GetMapping
    public ResponseEntity<String> getDateFromLib(){
        return new ResponseEntity<>(dateUtil.getDate(), HttpStatus.OK);
    }
}

