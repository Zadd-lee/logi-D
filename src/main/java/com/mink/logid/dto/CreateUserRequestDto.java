package com.mink.logid.dto;

import com.mink.logid.model.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CreateUserRequestDto {

    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;
    
    @NotBlank
    private String pw;

    public User toEntity() {
        return User.builder()
                .name(name)
                .email(email)
                .pw(pw)
                .enabled(true)
                .build();

    }
}
