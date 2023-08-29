package com.restoreserve.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateRestaurantDto {
    @NotEmpty(message = "Restaurant name required")
    private String name;
    @NotNull(message = "Id User with restaurant role required")
    private Long owner;
}
