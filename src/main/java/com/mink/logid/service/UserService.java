package com.mink.logid.service;

import com.mink.logid.dto.CreateUserRequestDto;
import com.mink.logid.dto.UserResponseDto;

public interface UserService {

    void create(CreateUserRequestDto dto);

    UserResponseDto findById(Long id);
}
