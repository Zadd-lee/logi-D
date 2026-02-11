package com.mink.logid.dto;

import com.mink.logid.model.Product;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductCreateDto {

    @NotNull
    private String name;
    private String content;

    public Product toEntity() {
        return Product.builder()
                .name(name)
                .content(content)
                .build();
    }

}
