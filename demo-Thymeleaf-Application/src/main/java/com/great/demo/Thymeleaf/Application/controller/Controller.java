package com.great.demo.Thymeleaf.Application.controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

    @GetMapping ("/sign-up")
     public String showSignUpPage(User user){
        return "add-user";
    }

    @PostMapping("/add-user")
    public String addUser(@Valid User user, BindingResult result. Model model){
        if(result.hasErrors()){
            return "addUser";
        }
        userRepository.save(user);
    }
}
