package com.itvedant.petstoreprac.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.itvedant.petstoreprac.entities.Product;

@Service
public class ProductService {
    private Map<Integer, Product> productMap = new HashMap<>();
    private AtomicInteger atomic = new AtomicInteger();
  
    public ProductService() {
        Product product1 = new Product();
        product1.setId(atomic.incrementAndGet()); // atomic we will create unqiue id and incrementandget we keep adding
                                                  // new id automatic
        product1.setName("Dog Shoes - Blue");
        product1.setPrice(500.1);
        product1.setDescription("Beautiful shoes with color Blue");
        productMap.put(product1.getId(), product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Dog Jacket - Red");
        product2.setPrice(799.99);
        product2.setDescription("Winter Protection Jackets for Dogs");
        productMap.put(product2.getId(), product2);
    }

    public Collection<Product> getProducts() {
        return productMap.values();
    }
}
