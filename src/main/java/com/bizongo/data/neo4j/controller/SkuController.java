package com.bizongo.data.neo4j.controller;

import com.bizongo.data.neo4j.domain.Sku;
import com.bizongo.data.neo4j.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class SkuController {
    @Autowired
    private ProductService productService;

    /*@GetMapping("/products")
    public Map<String, Object> graph(@RequestParam(value = "limit",required = false) Integer limit) {
        Iterable<Sku> skus = this.repository.findAll();
        Map<String,Object> map =new HashMap<>();
        for(Sku v :skus)
            map.put(v.getName(),v);
        return map;
    }*/

    /*@GetMapping("/product")
    public Map<String, Object> graph(@Param("skucode") String skucode ,@RequestParam(value = "limit",required = false) Integer limit) {
        Sku sku = this.productService.findBySkucode(skucode);
        Map<String,Object> map =new HashMap<>();
        map.put(sku.getName(),sku);
        return map;
    }*/

    @GetMapping("/product")
    public Map<String, Object> findBySubCategory(@Param("subcategory") String subcategory ) {
        List<Sku> skus = this.productService.findBySubCategory(subcategory);
        Map<String,Object> map =new HashMap<>();
        for(Sku sku:skus)
            map.put(sku.getName(),sku);
        return map;
    }
}
