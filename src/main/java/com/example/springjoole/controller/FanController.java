package com.example.springjoole.controller;

import com.example.springjoole.domain.Fan;
import com.example.springjoole.service.FanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api/")
public class FanController {

    @Autowired
    private FanService service;


    @RequestMapping(value = "/getFan", method = RequestMethod.GET)
    public ResponseEntity<?> getFan() {
        List<Fan> fan = service.getFan();
        return new ResponseEntity<>(fan, HttpStatus.OK);
    }
}
