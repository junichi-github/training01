package com.training01.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.training01.domain.Product;

/**
 * Product Service Implements Class
 * @author jun-ichi
 *
 */
@Component //annotation
public class ProductServiceImpl implements ProductService {

	/* log4j */
	private static final Logger log = LogManager.getLogger(ProductServiceImpl.class);

	@Autowired //annotation
	private ProductDao productDao;

	@Override
	public void addProduct(Product product) {
		log.debug("addProduct");
		productDao.addProduct(product);
	}

	@Override
	public Product findByProductName(String name) {
		log.debug("findByProductName");
		return productDao.findByProductName(name);
	}
}
