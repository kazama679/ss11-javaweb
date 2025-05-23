package com.data.repository;

import com.data.model.CategoryBai89;

import java.util.List;

public interface CategoryRepositoryBai89 {
    List<CategoryBai89> findAll();
    CategoryBai89 findById(int id);
    CategoryBai89 findByName(String name);
    void save(CategoryBai89 category);
    void update(CategoryBai89 category);
    void deleteById(int id);
}
