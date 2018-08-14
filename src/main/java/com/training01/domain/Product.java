package com.training01.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Product {

	private static final Logger log = LogManager.getLogger(Product.class);

	private String name;
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		String str = "Product [name=" + name + ", price=" + price + "]";
		log.info(str);
		return str;
	}

}
