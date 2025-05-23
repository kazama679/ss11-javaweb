package com.data.dto;


import com.data.validator.AdminGroup;
import com.data.validator.UserGroup;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserRegisterBai5 {

    @NotBlank(message = "Tên không được để trống", groups = {AdminGroup.class, UserGroup.class})
    private String name;

    @NotBlank(message = "Email không được để trống", groups = {AdminGroup.class, UserGroup.class})
    @Email(message = "Email không đúng định dạng", groups = {AdminGroup.class, UserGroup.class})
    private String email;

    @NotBlank(message = "Vai trò không được để trống", groups = {AdminGroup.class, UserGroup.class})
    private String role;

    @NotBlank(message = "Mã xác nhận admin là bắt buộc", groups = AdminGroup.class)
    private String adminCode;

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
