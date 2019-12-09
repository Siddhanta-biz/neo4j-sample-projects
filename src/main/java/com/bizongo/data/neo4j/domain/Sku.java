package com.bizongo.data.neo4j.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class Sku {
    @Id
    @GeneratedValue
    private Long id;
    private String name ;
    private String skucode ;

    @Relationship(type = "SELLER_INFO_OUT", direction = Relationship.INCOMING)
    private List<SellerDetail> sellerDetails;

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

    public String getSkucode() {
        return skucode;
    }

    public void setSkucode(String skucode) {
        this.skucode = skucode;
    }

    public Sku(){}

    public Sku(String name, String skucode) {
        this.name = name;
        this.skucode = skucode;
    }
}
