package com.training01.dataaccess;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.training01.domain.Product;
import com.training01.service.ProductDao;

@Component
public class ProductDaoImpl implements ProductDao {

	/* log4j */
	private static final Logger log = LogManager.getLogger(ProductDaoImpl.class);

	/* Data */
	private Map<String, Product> storage = new HashMap<String, Product>();

	@Override
	public Product findByProductName(String name) {
		log.debug("findByProductName");
		return storage.get(name);
	}

	@Override
	public void addProduct(Product product) {
		log.debug("addProduct");
		storage.put(product.getName(), product);
	}
}
