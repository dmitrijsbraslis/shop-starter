package com.app.controllers;

import com.app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @Autowired
    private UserService userService;

    @GetMapping("/greeting")
    public String welcome(Model model) {
        model.addAttribute("name", userService.getFirstUser());
        return "home";
    }
}
