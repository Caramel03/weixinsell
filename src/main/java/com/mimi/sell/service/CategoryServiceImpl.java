package com.mimi.sell.service;

import com.mimi.sell.dataobject.ProductCategory;
import com.mimi.sell.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author yami fang
 * @since 23:17 2018/3/13
 */
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return productCategoryRepository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryRepository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> CategoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(CategoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return productCategoryRepository.save(productCategory);
    }
}
