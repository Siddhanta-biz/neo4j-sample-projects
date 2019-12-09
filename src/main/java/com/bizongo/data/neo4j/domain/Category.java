package com.bizongo.data.neo4j.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String type;

    @Relationship(type = "SUB_CATEGORY_IN")
    private List<SubCategory> subCategories;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

    public Category(String type) {
        this.type = type;
    }

    public Category(String type, List<SubCategory> subCategories) {
        this.type = type;
        this.subCategories = subCategories;
    }
    public Category(){}
}
