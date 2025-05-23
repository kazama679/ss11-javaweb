package com.data.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CategoryBai89 {
    private int id;

    @NotBlank(message = "Tên danh mục là bắt buộc")
    @Size(max = 50, message = "Tên danh mục phải ít hơn 50 ký tự")
    private String categoryName;

    private boolean status = true;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
