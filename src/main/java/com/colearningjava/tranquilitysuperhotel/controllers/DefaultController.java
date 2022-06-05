package com.colearningjava.tranquilitysuperhotel.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/")
    public ResponseEntity<String> getDefault(){
        return ResponseEntity.ok("<h1>This is the main page</P>");
    }
}
