package com.data.controller;

import com.data.model.UserRegister;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("userRegister", new UserRegister());
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(@Valid @ModelAttribute("userRegister") UserRegister userRegister,
                             BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }
        return "success";
    }
}