package com.mink.logid.service.impl;

import com.mink.logid.common.constants.UserError;
import com.mink.logid.common.exception.CustomException;
import com.mink.logid.dto.CreateUserRequestDto;
import com.mink.logid.dto.UserResponseDto;
import com.mink.logid.model.User;
import com.mink.logid.repository.UserRepository;
import com.mink.logid.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Transactional
    @Override
    public void create(CreateUserRequestDto dto) {
        User entity = dto.toEntity();
        userRepository.save(entity);
    }

    @Override
    public UserResponseDto findById(Long id) {
        User user = userRepository.findByIdOrElseThrow(id);
        return new UserResponseDto(user);
    }

    @Override
    public List<UserResponseDto> findAll() {
        Iterable<User> all = userRepository.findAll();
        List<UserResponseDto> userResponseDtoList = new ArrayList<>();;
        all.iterator().forEachRemaining(user-> {
            userResponseDtoList.add(new UserResponseDto(user));
        });

        return userResponseDtoList;


    }
}
