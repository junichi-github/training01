package com.training01.service;

import com.training01.domain.Product;

public interface ProductDao {

	void addProduct(Product product);
	Product findByProductName(String name);

}
