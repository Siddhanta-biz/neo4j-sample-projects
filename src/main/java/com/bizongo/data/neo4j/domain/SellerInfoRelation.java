package com.bizongo.data.neo4j.domain;

import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "SELLER_INO_IN")
public class SellerInfoRelation {

    @Id
    @GeneratedValue
    private long id;

    private String info;

    @StartNode
    private Sellers sellers;

    @EndNode
    private Seller seller1;

    @StartNode
    private Seller seller2;

    @EndNode
    private SellerDetail sellerDetail;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public SellerInfoRelation(String info) {
        this.info = info;
    }
    public SellerInfoRelation(){}

    public SellerInfoRelation(Sellers sellers, Seller seller1) {
        this.sellers = sellers;
        this.seller1 = seller1;
    }

    public SellerInfoRelation(Seller seller2, SellerDetail sellerDetail) {
        this.seller2 = seller2;
        this.sellerDetail = sellerDetail;
    }
}
