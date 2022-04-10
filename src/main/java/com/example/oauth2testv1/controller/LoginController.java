package com.example.oauth2testv1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login")
    public String getLoginPage() {

        return "Success login";
    }

    @GetMapping("/loginSuccess")
    public String getLoginPage2() {

        return "Failed login";
    }

    @GetMapping("/access")
    public String getLoginPage3() {

        return "Access login";
    }
}
