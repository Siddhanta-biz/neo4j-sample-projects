package com.bizongo.data.neo4j.domain;

import org.neo4j.ogm.annotation.*;

@RelationshipEntity
public class SubCategoryRelation {
    @Id
    @GeneratedValue
    private Long id;
    private String subCategoryInfo;

    @StartNode
    private SubCategory subCategorySource;

    @EndNode
    private SubCategory subCategoryEnd;

    @StartNode
    private Category category;

    @EndNode
    private Sku sku;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubCategoryInfo() {
        return subCategoryInfo;
    }

    public void setSubCategoryInfo(String subCategoryInfo) {
        this.subCategoryInfo = subCategoryInfo;
    }

    public SubCategory getSubCategorySource() {
        return subCategorySource;
    }

    public void setSubCategorySource(SubCategory subCategorySource) {
        this.subCategorySource = subCategorySource;
    }

    public SubCategory getSubCategoryEnd() {
        return subCategoryEnd;
    }

    public void setSubCategoryEnd(SubCategory subCategoryEnd) {
        this.subCategoryEnd = subCategoryEnd;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public SubCategoryRelation(SubCategory subCategorySource, SubCategory subCategoryEnd) {
        this.subCategorySource = subCategorySource;
        this.subCategoryEnd = subCategoryEnd;
    }

    public SubCategoryRelation(SubCategory subCategorySource, Sku sku) {
        this.subCategorySource = subCategorySource;
        this.sku = sku;
    }

    public SubCategoryRelation(SubCategory subCategoryEnd, Category category) {
        this.subCategoryEnd = subCategoryEnd;
        this.category = category;
    }
}
