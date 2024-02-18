package com.example.ddd.Service;

public class ProductService {
    public Page<Product> getProductOfCategory(Long categoryId, int page, int size){
        Category category = categoryRepository.findById(categoryId);
        checkCategory(category);
        List<Product> products = productRepository.findByCategoryId(category.getId(), page, size);
        int totalCount = productRepository.countByCategoryId(category.getId());
        return new Page(page,size,totalCount,products);
    }
}
