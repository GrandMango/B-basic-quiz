package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Education {
    private long userId;
    @NotNull(message = "year can not be blank")
    private long year;

    @NotBlank(message = "title can not be blank")
    @Size(min = 1, max = 256, message = "length of title should between 1 to 128 characters")
    private String title;

    @NotBlank(message = "description can not be blank")
    @Size(min = 1, max = 4096, message = "length of description should between 1 to 128 characters")
    private String description;
}
