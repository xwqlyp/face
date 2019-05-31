package com.bjym.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bjym.pojo.Product;
import com.bjym.service.ProductService;

public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/listImages")
	public ModelAndView list(Model model) {
		List<Product> lists = productService.list();
		ModelAndView mav = new ModelAndView();
		mav.addObject("lists", lists);
		mav.setViewName("list");
		System.out.println(lists);
		return mav;
	}
	
	/**
	 * 保存图片
	 * @param file
	 * @param product
	 * @param map
	 * @return
	 */
	@RequestMapping("/save")
	public String save(MultipartFile file, Product product, ModelMap map) {
		try {
			return productService.save(file, product, map);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
