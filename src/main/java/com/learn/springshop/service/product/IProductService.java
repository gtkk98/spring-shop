package com.learn.springshop.service.product;

import com.learn.springshop.model.Product;
import com.learn.springshop.request.AddProductRequest;

import java.util.List;

public interface   IProductService {

    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void updateProduct(Product product);
    void deleteProductById(Long id);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);
}
