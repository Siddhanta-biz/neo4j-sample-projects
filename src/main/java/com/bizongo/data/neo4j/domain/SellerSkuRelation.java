package com.bizongo.data.neo4j.domain;

import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "SELLER_INFO_OUT")
public class SellerSkuRelation {

    @Id
    @GeneratedValue
    private Long id;

    private String info;

    @StartNode
    private SellerDetail sellerDetail;

    @EndNode
    private Sku sku;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public SellerDetail getSellerDetail() {
        return sellerDetail;
    }

    public void setSellerDetail(SellerDetail sellerDetail) {
        this.sellerDetail = sellerDetail;
    }

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public SellerSkuRelation(String info) {
        this.info = info;
    }

    public SellerSkuRelation(SellerDetail sellerDetail, Sku sku) {
        this.sellerDetail = sellerDetail;
        this.sku = sku;
    }
}
