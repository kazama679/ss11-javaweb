package com.data.dto;

import com.data.validator.Phone;

import javax.validation.constraints.NotBlank;

public class UserDTOBai6 {

    @NotBlank(message = "Tên không được để trống")
    private String name;

    @Phone
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
