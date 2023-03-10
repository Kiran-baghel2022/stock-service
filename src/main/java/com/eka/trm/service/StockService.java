package com.eka.trm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eka.trm.model.GoodRecordDetails;
import com.eka.trm.repository.StockRepository;

@Service
public class StockService {
	
	@Autowired
	StockRepository stockRepository;
	
	public List<GoodRecordDetails> stockList(){
		List<GoodRecordDetails> stockList= stockRepository.findAll();
		return stockList;
	}

	public Optional<GoodRecordDetails> getStockFindById(Integer id) {
		Optional<GoodRecordDetails> goodRecordDetails=stockRepository.findById(id);
		return goodRecordDetails;
	}

}
