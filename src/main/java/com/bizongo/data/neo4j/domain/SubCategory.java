package com.bizongo.data.neo4j.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class SubCategory {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @Relationship(type = "SUB_CATEGORY_IN")
    private List<SubCategory>  subCategories;

    @Relationship(type = "SKU_INFO_IN")
    private List<Sku> skuList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

    public List<Sku> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<Sku> skuList) {
        this.skuList = skuList;
    }

    public SubCategory(String name, List<SubCategory> subCategories, List<Sku> skuList) {
        this.name = name;
        this.subCategories = subCategories;
        this.skuList = skuList;
    }

    public SubCategory(String name) {
        this.name = name;
    }

    public SubCategory(){}
}
