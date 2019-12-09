package com.bizongo.data.neo4j.repositories;


import com.bizongo.data.neo4j.domain.Sku;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

//@RepositoryRestResource(collectionResourceRel = "product", path = "product")
public interface ProductRepository extends Neo4jRepository<Sku, Long> {


/*    @Query("MATCH (bacon:SubCategory {name:\"LED TV\"})-[*1..4]-(hollywood)\n" +
            "where hollywood.skucode  CONTAINS 'skuCode' RETURN DISTINCT hollywood ")
    Collection<Sku> getAllSkus(@Param("skuCode") String skuCode);*/
    //@Query("MATCH (a:Sku) where a.skucode ='Sam-3D-sku-01' return a")
    //Sku findBySkucode(@Param("skucode") String skuCode);

    Sku findBySkucode(@Param("skucode") String skuCode);

    @Query("MATCH (bacon:SubCategory {name:{0}})-[*1..4]-(hollywood) where hollywood.skucode  CONTAINS 'sku' RETURN DISTINCT hollywood ")
    List<Sku> findBySubCategory(String subcategory);
}
