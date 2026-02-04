package com.mink.logid.service.impl;

import com.mink.logid.dto.CreateUserRequestDto;
import com.mink.logid.dto.UserResponseDto;
import com.mink.logid.model.User;
import com.mink.logid.repository.UserRepository;
import com.mink.logid.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public void create(CreateUserRequestDto dto) {
        User entity = dto.toEntity();
        userRepository.save(entity);
    }

    @Override
    public UserResponseDto findById(Long id) {
        User user = userRepository.findById(id).orElseThrow();
        return new UserResponseDto(user);
    }
}
