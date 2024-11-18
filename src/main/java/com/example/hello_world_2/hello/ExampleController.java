package com.example.hello_world_2.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ExampleController {

    @GetMapping("/get")
    public ResponseEntity<String> HelloWrold(){
        return new ResponseEntity<>("hello world", HttpStatus.OK);
    }
}
