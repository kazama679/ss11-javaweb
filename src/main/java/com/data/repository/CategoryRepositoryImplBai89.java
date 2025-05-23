package com.data.repository;

import com.data.model.CategoryBai89;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepositoryImplBai89 implements CategoryRepositoryBai89 {

    private final List<CategoryBai89> list = new ArrayList<>();

    @Override
    public List<CategoryBai89> findAll() {
        return list;
    }

    @Override
    public CategoryBai89 findById(int id) {
        return list.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    @Override
    public CategoryBai89 findByName(String name) {
        return list.stream().filter(c -> c.getCategoryName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    @Override
    public void save(CategoryBai89 category) {
        category.setId(list.size() + 1);
        list.add(category);
    }

    @Override
    public void update(CategoryBai89 category) {
        CategoryBai89 existing = findById(category.getId());
        if (existing != null) {
            existing.setCategoryName(category.getCategoryName());
            existing.setStatus(category.isStatus());
        }
    }

    @Override
    public void deleteById(int id) {
        list.removeIf(c -> c.getId() == id);
    }
}