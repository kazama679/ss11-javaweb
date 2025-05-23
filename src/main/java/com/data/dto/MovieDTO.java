package com.data.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
public class MovieDTO {
    private int id;
    @NotBlank(message = "Tiêu đề k để trống!")
    private String title;
    private String email;
    private int quantity;
    private LocalDate birthday;
    private LocalDate eventDate;
}
