package com.learn.springshop.service.product;

import com.learn.springshop.model.Product;

import java.util.List;

public interface IProductService {

    Product addProduct(Product product);
    Product getProductById(Long id);
    void updateProduct(Product product);
    void deleteProductById(Long id);
    List<Product> getAllProducts();
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductByBrandAndName(String brand, String name);
    List<Product> getProductByCategoryAndBrand(String category, String brand);
    Long countProductsByBrandAndName(String brand, String name);
}
