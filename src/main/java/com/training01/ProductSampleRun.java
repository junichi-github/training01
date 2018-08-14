package com.training01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training01.domain.Product;
import com.training01.service.ProductService;

/**
 * Spring Framework DI Sample Run
 * @author jun-ichi
 *
 */
public class ProductSampleRun {

	/* Log4j */
	private static final Logger log = LogManager.getLogger(ProductSampleRun.class);

	/**
	 * entry point
	 * @param args
	 */
	public static void main(String[] args) {
		log.debug("begin");

		ProductSampleRun productSampleRun = new ProductSampleRun();
		productSampleRun.execute();

		log.debug("end");
	}

	@SuppressWarnings("resource")
	public void execute() {
		try {
			BeanFactory ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			log.debug("getBean:begin");
			ProductService productService = ctx.getBean(ProductService.class);
			log.debug("getBean:end");

			productService.addProduct(new Product("ホチキス", 100));

			Product product = productService.findByProductName("ホチキス");
			System.out.println(product);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

}
