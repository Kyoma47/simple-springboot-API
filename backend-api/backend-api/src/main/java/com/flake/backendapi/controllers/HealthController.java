package com.flake.backendapi.controllers;

import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.GetMapping; 

@GetMapping("/health")
public class HealthController {
    public ResponseEntity<?> health () {
        return new ResponseEntity<>(HttpStatus.OK)
    }
}