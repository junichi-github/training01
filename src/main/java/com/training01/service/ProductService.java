package com.training01.service;

import com.training01.domain.Product;

/**
 * Product Service Interface
 * @author jun-ichi
 *
 */
public interface ProductService {

	void addProduct(Product product);

	Product findByProductName(String name);

}
