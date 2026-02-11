package com.mink.logid.dto;

import com.mink.logid.model.User;
import lombok.Getter;

import java.time.format.DateTimeFormatter;

@Getter
public class UserResponseDto {
    private Long id;
    private String name;
    private String email;
    private String enabled;
    private String createdDate;
    private String updatedDate;


    public UserResponseDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.enabled = user.isEnabled() ? "Yes" : "No";
        this.createdDate = user.getCreatedAt().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.updatedDate = user.getUpdatedAt().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
