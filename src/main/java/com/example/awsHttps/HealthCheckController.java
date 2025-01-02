package com.example.awsHttps;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {


    @GetMapping("/health")

    public ResponseEntity<String>  health (){

        return ResponseEntity.ok("running");
    }
}
