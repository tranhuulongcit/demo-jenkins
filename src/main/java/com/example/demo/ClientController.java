package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ClientController {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public ResponseEntity<String> hello() {
    return new ResponseEntity<>("deploy developp ok", HttpStatus.OK);
}

}
