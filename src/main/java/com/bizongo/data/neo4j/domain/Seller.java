package com.bizongo.data.neo4j.domain;

import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity
public class Seller {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    @Relationship(type = "SELLER_INFO_IN")
    private List<SellerDetail> sellerDetails;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SellerDetail> getSellerDetails() {
        return sellerDetails;
    }

    public void setSellerDetails(List<SellerDetail> sellerDetails) {
        this.sellerDetails = sellerDetails;
    }

    public Seller(){}
    public Seller(String name, List<SellerDetail> sellerDetails) {
        this.name = name;
        this.sellerDetails = sellerDetails;
    }
}
