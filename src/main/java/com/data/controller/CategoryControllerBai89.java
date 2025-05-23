package com.data.controller;

import com.data.model.CategoryBai89;
import com.data.repository.CategoryRepositoryBai89;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categories")
public class CategoryControllerBai89 {

    @Autowired
    private CategoryRepositoryBai89 repositoryBai89;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("categories", repositoryBai89.findAll());
        return "category/list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("category", new CategoryBai89());
        return "category/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("category") @javax.validation.Valid CategoryBai89 category, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "category/form";
        }
        if (category.getId() == 0) repositoryBai89.save(category);
        else repositoryBai89.update(category);
        return "redirect:/categories";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable int id, Model model) {
        model.addAttribute("category", repositoryBai89.findById(id));
        return "category/form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        repositoryBai89.deleteById(id);
        return "redirect:/categories";
    }
}