package com.mink.logid.dto;

import com.mink.logid.model.Product;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * DTO for {@link com.mink.logid.model.Product}
 */
@Getter
@ToString
public class ProductResponseDto implements Serializable {
    private final Long id;
    private final String SKU;
    private final String name;
    private final String content;

    public ProductResponseDto(Product product) {
        this.id = product.getId();
        this.SKU = product.getSKU();
        this.name = product.getName();
        this.content = product.getContent();
    }
}