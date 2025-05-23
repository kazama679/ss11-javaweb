package com.data.controller;

import com.data.dto.ReviewDTOBai7;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ReviewControllerBai7 {

    @GetMapping("/reviewBai7")
    public String showReviewForm(Model model) {
        model.addAttribute("review", new ReviewDTOBai7());
        return "reviewBai7";
    }

    @PostMapping("/reviewBai7")
    public String submitReview(@Valid @ModelAttribute("review") ReviewDTOBai7 review,
                               BindingResult result,
                               Model model) {
        if (result.hasErrors()) {
            return "reviewBai7";
        }
        return "redirect:/thankyou";
    }
}
