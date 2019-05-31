package com.bjym.service;

import java.io.IOException;
import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import com.bjym.pojo.Product;

public interface ProductService  {
    
    
    public String save(MultipartFile file, Product product, ModelMap map) throws IOException ;

	List<Product> list();
        

}