package com.accenture.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AuthenticationController {

    @GetMapping("/login")
    public String getSignInPage(){
        return "login";
    }
    @GetMapping("")
    public String redirectToLogin(){
        return "redirect:login";
    }
    @GetMapping("/signup")
    public String getSignUpPage(){ return "signup";}



}
