package com.bjym.dao;

import java.util.List;

import com.bjym.pojo.Product;



public interface ProductMapper {
    
    /**
     * 查询所有的图片
     * @return
     */
    List<Product> list();
    
    /**
     * 上传一张图片
     * @param product
     * @return
     */
    Integer save(Product product);
}