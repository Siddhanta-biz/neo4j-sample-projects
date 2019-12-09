package com.bizongo.data.neo4j.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;


@NodeEntity
public class SellerDetail {

    @Id
    @GeneratedValue
    private long id;

    private String name ;

    private String area;

    private String state;

    private String city;

    @Relationship(type="SELLER_INFO_OUT")
    private List<Sku> skuList;

    public SellerDetail(){}
    public SellerDetail(String name, String area, String state, String city) {
        this.name = name;
        this.area = area;
        this.state = state;
        this.city = city;
    }

    public SellerDetail(String name, String area, String state, String city, List<Sku> skuList) {
        this.name = name;
        this.area = area;
        this.state = state;
        this.city = city;
        this.skuList = skuList;
    }

    public List<Sku> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<Sku> skuList) {
        this.skuList = skuList;
    }

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
