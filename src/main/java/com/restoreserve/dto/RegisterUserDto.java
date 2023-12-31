package com.restoreserve.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserDto {
    
    @NotEmpty(message = "Fullname is Required")
    private String fullName;
    @NotEmpty(message = "Username is Required")
    private String username;
    @NotEmpty(message = "Email is Required")
    @Email
    private String email;
    @NotEmpty(message = "Password is Required")
    private String password;
    @NotEmpty(message = "Role is Required")
    private String role;
}
