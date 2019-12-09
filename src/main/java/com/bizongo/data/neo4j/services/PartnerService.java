package com.bizongo.data.neo4j.services;

import com.bizongo.data.neo4j.domain.SellerDetail;
import com.bizongo.data.neo4j.repositories.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class PartnerService {

    @Autowired
    private PartnerRepository partnerRepository;
    @Transactional(readOnly = true)
    public List<SellerDetail> findAllBySellersFromCategory(String category , String State ){
        return partnerRepository.findAllBySellersFromCategory(category,State);
    }
    @Transactional(readOnly = true)
    public List<SellerDetail> findAllBySellersFromCategory(String category){
        List<SellerDetail> sellerDetails =partnerRepository.findAllBySellersFromCategory(category);
        return sellerDetails;
    }
    @Transactional(readOnly = true)
    public List<SellerDetail> findAllBySellersfromSku(String sku){
        return partnerRepository.findAllBySellersfromSku(sku);
    }
    @Transactional(readOnly = true)
    public List<SellerDetail> findAllBySellersfromSku(String sku,String state){
        return partnerRepository.findAllBySellersfromSku(sku,state);
    }

}
