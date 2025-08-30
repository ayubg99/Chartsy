package com.dailycodework.dream_shops.service.product;

import com.dailycodework.dream_shops.model.Product;

import java.util.List;

public class ProductService implements IProductService {

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(long id) {
        return null;
    }

    @Override
    public void deleteProductById(long id) {

    }

    @Override
    public void updateProduct(Product product, Long productId) {

    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public List<Product> getAllProductsByCategory(String category) {
        return List.of();
    }

    @Override
    public List<Product> getAllProductsByBrand(String brand) {
        return List.of();
    }

    @Override
    public List<Product> getAllProductsByCategoryAndBrand(String category, String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrandAndName(String brand, String name) {
        return List.of();
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        return 0L;
    }
}
