package com.mink.logid.model;

import com.mink.logid.util.SKUGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Entity
@NoArgsConstructor
@Getter
public class Product extends BaseEntity{
    @Id
    @GeneratedValue()
    private Long id;
    private String SKU;
    private String name;
    private String content;
    private boolean enabled;

    public Product(Long id, String SKU, String name, String content, boolean enabled) {
        this.id = id;
        this.SKU = SKUGenerator.generateSKU();
        this.name = name;
        this.content = content;
        this.enabled = true;
    }

}
