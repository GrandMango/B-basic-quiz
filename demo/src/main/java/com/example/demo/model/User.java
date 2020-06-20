package com.example.demo.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private long userId;
    @NotBlank(message = "name can not be blank")
    @Size(min = 1, max = 128, message = "length of name should between 1 to 128 characters")
    private String name;

    @NotNull(message = "age can not be blank")
    @Min(value = 16, message = "minimum age should greater than 16")
    private long age;

    @NotBlank(message = "avatar can not be blank")
    @Size(min = 8, max = 512, message = "length of avatar should between 8 to 512 characters")
    private String avatar;

    @Size(min = 0, max = 1024, message = "description is too long")
    private String description;
}
