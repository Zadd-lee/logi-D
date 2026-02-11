package com.mink.logid.service.impl;

import com.mink.logid.common.constants.CommonErrorCode;
import com.mink.logid.common.exception.CustomException;
import com.mink.logid.dto.ProductCreateDto;
import com.mink.logid.dto.ProductResponseDto;
import com.mink.logid.model.Product;
import com.mink.logid.repository.ProductRepository;
import com.mink.logid.service.ProductService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;

    @Transactional
    @Override
    public ProductResponseDto create(ProductCreateDto dto) {
        Product product = dto.toEntity();

        //validate
        if (repository.existsBySKU(product.getSKU())) {
            throw new CustomException(CommonErrorCode.INTERNAL_SERVER_ERROR);
        }

        repository.save(product);
        return new ProductResponseDto(product);

    }
}
