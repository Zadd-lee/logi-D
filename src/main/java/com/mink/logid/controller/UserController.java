package com.mink.logid.controller;

import com.mink.logid.dto.CreateUserRequestDto;
import com.mink.logid.dto.UserResponseDto;
import com.mink.logid.dto.UpdateUserRequestDto;
import com.mink.logid.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserService service;

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody CreateUserRequestDto dto) {
        service.create(dto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getUserById(@PathVariable Long id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAllUsers() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }


    @PatchMapping("/{id}")
    public ResponseEntity<Void> updateUser(@PathVariable Long id,@RequestBody UpdateUserRequestDto dto) {
        service.update(id, dto);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
