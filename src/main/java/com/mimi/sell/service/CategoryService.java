package com.mimi.sell.service;

import com.mimi.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @author yami fang
 * @since 23:12 2018/3/13
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> CategoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
