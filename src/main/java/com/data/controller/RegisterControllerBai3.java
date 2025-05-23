package com.data.controller;

import com.data.model.UserRegisterBai3;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterControllerBai3 {

    @GetMapping("/registerBai3")
    public String showForm(Model model) {
        model.addAttribute("userRegisterBai3", new UserRegisterBai3());
        return "registerBai3";
    }

    @PostMapping("/registerBai3")
    public String submitForm(@Valid @ModelAttribute("userRegisterBai3") UserRegisterBai3 user,
                             BindingResult result) {
        if (result.hasErrors()) {
            return "registerBai3";
        }
        return "successBai3";
    }
}