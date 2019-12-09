package com.bizongo.data.neo4j.repositories;

import com.bizongo.data.neo4j.domain.SellerDetail;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import java.util.List;

public interface PartnerRepository  extends Neo4jRepository<SellerDetail ,Long> {
    @Query("MATCH (bacon:SubCategory {name:{0}})-[*1..4]-(selldetail) where selldetail:SellerDetail  and  selldetail.state={1} RETURN DISTINCT selldetail")
    public List<SellerDetail> findAllBySellersFromCategory(String category, String State);
    @Query("MATCH (bacon:SubCategory {name:{0}})-[*1..4]-(selldetail) where selldetail:SellerDetail RETURN DISTINCT selldetail")
    public List<SellerDetail> findAllBySellersFromCategory(String category);
    @Query("MATCH (bacon:Sku {skucode:{0}})<-[SELLER_INFO_OUT]-(selldetail) where selldetail:SellerDetail RETURN DISTINCT selldetail")
    public List<SellerDetail> findAllBySellersfromSku(String skucode);
    @Query("MATCH (bacon:Sku {skucode:{0}})<-[SELLER_INFO_OUT]-(selldetail) where selldetail:SellerDetail  and  selldetail.state={1} RETURN DISTINCT selldetail")
    public List<SellerDetail> findAllBySellersfromSku(String sku, String state);
}
