package com.bizongo.data.neo4j.controller;

import com.bizongo.data.neo4j.services.PartnerService;
import com.bizongo.data.neo4j.domain.SellerDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/partner")
public class PartnerController {

    @Autowired
    private PartnerService partnerService;

    @GetMapping(params = {"category","State"})
    public List<SellerDetail> getAllSellersFromCategory(@Param("category")String category , @Param("State") String State ){
        return partnerService.findAllBySellersFromCategory(category,State);
    }

    @GetMapping(params = {"category"})
    public List<SellerDetail> getAllSellersFromCategory(@Param("category")String category){
        return partnerService.findAllBySellersFromCategory(category);
    }

    @GetMapping(params = {"sku"})
    public List<SellerDetail> getAllSellersfromSku(@Param("sku")String sku){
        return partnerService.findAllBySellersfromSku(sku);
    }

    @GetMapping(params = {"sku","states"})
    public List<SellerDetail> getAllSellersfromSku(@Param("sku")String sku,@Param("states")String state){
        return partnerService.findAllBySellersfromSku(sku,state);
    }
}
