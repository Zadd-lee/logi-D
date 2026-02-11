package com.mink.logid.repository;

import com.mink.logid.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    boolean existsBySKU(String sku);
}
