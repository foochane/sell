package com.chane.service;

import com.chane.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * Created by chane on 2017/9/10.
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
