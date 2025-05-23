package com.data.validator;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidatorBai6 implements ConstraintValidator<Phone, String> {

    @Override
    public boolean isValid(String phoneField, ConstraintValidatorContext context) {
        if (phoneField == null) return false;
        return phoneField.matches("^0\\d{9}$");
    }
}
