package com.example.Spring_security_basics.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VaultController {

    @GetMapping("/public/info")
    public String publicInfo() {
        return "This is public info , anyone can see this";
    }

    @GetMapping("/private/vault")
    public String privateVault() {
        return "This is the secret vault. You should be logged in to see this!";
    }

}
