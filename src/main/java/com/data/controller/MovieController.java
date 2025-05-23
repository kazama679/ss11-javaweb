package com.data.controller;

import com.data.dto.MovieDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MovieController {
    @GetMapping("movie")
    public String movieForm(@ModelAttribute("movieDTO") MovieDTO movieDTO) {
        return "movie_form";
    }

    @PostMapping("movie-save")
    public String movieSave(@Valid @ModelAttribute("movieDTO") MovieDTO movieDTO,
                            BindingResult bindingResult) {
        System.out.println(movieDTO);
        System.out.println(bindingResult.getFieldErrors());
        System.out.println(bindingResult.hasErrors());
        return "movie_save";
    }
}
