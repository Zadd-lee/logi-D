package com.mink.logid.service;

import com.mink.logid.dto.CreateUserRequestDto;
import com.mink.logid.dto.UpdateUserRequestDto;
import com.mink.logid.dto.UserResponseDto;

import java.util.List;

public interface UserService {

    void create(CreateUserRequestDto dto);

    UserResponseDto findById(Long id);

    List<UserResponseDto> findAll();

    void update(Long id, UpdateUserRequestDto dto);
}
