package com.mink.logid.controller;

import com.mink.logid.dto.ProductCreateDto;
import com.mink.logid.dto.ProductResponseDto;
import com.mink.logid.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ResponseEntity<ProductResponseDto> create(@RequestBody ProductCreateDto dto) {
        return new ResponseEntity<>(service.create(dto), HttpStatus.ACCEPTED);

    }


    }
}
