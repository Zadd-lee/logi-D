package com.mink.logid.service;

import com.mink.logid.dto.ProductCreateDto;
import com.mink.logid.dto.ProductResponseDto;

public interface ProductService {

    ProductResponseDto create(ProductCreateDto dto);
}
