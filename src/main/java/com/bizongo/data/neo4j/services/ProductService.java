package com.bizongo.data.neo4j.services;

import com.bizongo.data.neo4j.domain.Sku;
import com.bizongo.data.neo4j.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public Sku findBySkucode(String skuCode) {
        return productRepository.findBySkucode(skuCode);
    }
    @Transactional(readOnly = true)
    public List<Sku> findBySubCategory(String subcategory){
        return productRepository.findBySubCategory(subcategory);
    }
}
