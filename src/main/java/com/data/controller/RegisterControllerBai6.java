package com.data.controller;

import com.data.dto.UserDTOBai6;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegisterControllerBai6 {
    @GetMapping("/registerBai6")
    public String showForm(Model model) {
        model.addAttribute("user", new UserDTOBai6());
        return "registerBai6";
    }

    @PostMapping("/registerBai6")
    public String submitForm(@Valid @ModelAttribute("user") UserDTOBai6 user,
                             BindingResult result,
                             Model model) {
        if (result.hasErrors()) {
            return "registerBai6";
        }
        return "redirect:/success";
    }
}