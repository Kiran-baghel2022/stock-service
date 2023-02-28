package com.eka.trm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eka.trm.model.GoodRecordDetails;

@Repository
public interface StockRepository extends JpaRepository<GoodRecordDetails, Integer>{

}
