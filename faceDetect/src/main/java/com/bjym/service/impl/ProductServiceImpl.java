package com.bjym.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import com.bjym.dao.ProductMapper;
import com.bjym.pojo.Product;
import com.bjym.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> list() {
        return productMapper.list();
    }

    @Override
    @Transactional
    public String save(MultipartFile file, Product product, ModelMap map) throws IOException {
        
        // 保存图片的路径，图片上传成功后，将路径保存到数据库
        String filePath = "F:\\upload";
        // 获取原始图片的扩展名
        String originalFilename = file.getOriginalFilename();
        // 生成文件新的名字
        String newFileName = UUID.randomUUID() + originalFilename;
        // 封装上传文件位置的全路径
        File targetFile = new File(filePath, newFileName);
        file.transferTo(targetFile);    
        
        // 保存到数据库
        product.setPimage(newFileName);
        
        productMapper.save(product);
        return "redirect:/listImages";
    }

}