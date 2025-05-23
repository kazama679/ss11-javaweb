package com.data.controller;

import com.data.dto.UserRegisterBai5;
import com.data.validator.AdminGroup;
import com.data.validator.UserGroup;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Controller
public class RegisterControllerBai5 {

    @GetMapping("/registerBai5")
    public String showForm(Model model) {
        model.addAttribute("userRegisterBai5", new UserRegisterBai5());
        return "registerBai5";
    }

    @PostMapping("/registerBai5")
    public String submitForm(
            @ModelAttribute("userRegisterBai5") UserRegisterBai5 user,
            BindingResult result) {
        Class<?> group = "admin".equals(user.getRole()) ? AdminGroup.class : UserGroup.class;
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<UserRegisterBai5>> violations = validator.validate(user, group);
        for (ConstraintViolation<UserRegisterBai5> violation : violations) {
            result.rejectValue(
                    violation.getPropertyPath().toString(),
                    "",
                    violation.getMessage()
            );
        }
        if (result.hasErrors()) {
            return "registerBai5";
        }
        return "success";
    }
}