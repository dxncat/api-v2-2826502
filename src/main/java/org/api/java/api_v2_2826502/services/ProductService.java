package org.api.java.api_v2_2826502.services;

import org.api.java.api_v2_2826502.entities.Product;
import org.api.java.api_v2_2826502.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    //operaciones CRUD
    public List<Product> findAll(){
        return (List<Product>) repository.findAll();
    }

    public Product findById(Long id){
        return repository.findById(id).get();
    }
}
