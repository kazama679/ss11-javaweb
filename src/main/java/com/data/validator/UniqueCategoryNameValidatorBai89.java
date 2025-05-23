package com.data.validator;

import com.data.model.CategoryBai89;
import com.data.repository.CategoryRepositoryBai89;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueCategoryNameValidatorBai89 implements ConstraintValidator<UniqueCategoryNameBai89, CategoryBai89> {

    @Autowired
    private CategoryRepositoryBai89 repo;

    @Override
    public boolean isValid(CategoryBai89 category, ConstraintValidatorContext context) {
        CategoryBai89 existing = repo.findByName(category.getCategoryName());
        if (existing == null) return true;
        return existing.getId() == category.getId();
    }
}