package org.margo.start.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/health")
    public String getHealthCheck() {
        return "Yay! I hit my endpoint!";

    }
}
