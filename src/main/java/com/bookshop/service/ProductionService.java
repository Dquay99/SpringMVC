package com.bookshop.service;

import com.bookshop.model.ProductionModel;
import com.bookshop.repository.ProductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductionService {

    @Autowired
    private ProductionRepository productionRepository;

    public List<ProductionModel> readAllProduction() {
        try {
            List<ProductionModel> response =  productionRepository.getAllProduction();
            return response;
        }catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
