package com.bizongo.data.neo4j.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String company;
    private String tagline;

    @Relationship(type = "CATEGORY_IN")
    private List<Category> categoryList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public Product(String title, String company, String tagline) {
        this.title = title;
        this.company = company;
        this.tagline = tagline;
    }

    public Product(String title, String company, String tagline, List<Category> categoryList) {
        this.title = title;
        this.company = company;
        this.tagline = tagline;
        this.categoryList = categoryList;
    }

    public Product(){}
}
