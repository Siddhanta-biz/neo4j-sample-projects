package com.bizongo.data.neo4j.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class Sellers {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @Relationship(type = "SELLER_INFO_IN")
    private List<Seller> sellers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(List<Seller> sellers) {
        this.sellers = sellers;
    }

    public Sellers(String name, List<Seller> sellers) {
        this.name = name;
        this.sellers = sellers;
    }
    public Sellers(){}
}
