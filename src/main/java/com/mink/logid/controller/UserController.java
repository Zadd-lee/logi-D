package com.mink.logid.controller;

import com.mink.logid.dto.CreateUserRequestDto;
import com.mink.logid.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
