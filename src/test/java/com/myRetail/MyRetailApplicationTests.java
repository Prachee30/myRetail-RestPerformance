package com.myRetail;

import com.myRetail.exception.ResourceNotFoundException;
import com.myRetail.model.CurrentPrice;
import com.myRetail.model.Product;
import com.myRetail.service.ProductServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class MyRetailApplicationTests {

	@Autowired
	private ProductServiceImpl productService;

	@Test
	public void testSaveProduct() {

		CurrentPrice currentPrice = new CurrentPrice();
		currentPrice.setCurrentPriceId(1);
		currentPrice.setCurrencyCode("USD");
		currentPrice.setValue(999.88);

		Product product = new Product();
		product.setProductId(1234);
		product.setCurrentPrice(currentPrice);

		Product newProduct = this.productService.saveProduct(product);
		Assert.assertEquals(1234, newProduct.getProductId());
	}

	@Test
	public void testSaveProducts(){

		CurrentPrice currentPrice1 = new CurrentPrice();
		currentPrice1.setCurrentPriceId(2);
		currentPrice1.setCurrencyCode("INR");
		currentPrice1.setValue(1123.00);

		CurrentPrice currentPrice2 = new CurrentPrice();
		currentPrice2.setCurrentPriceId(3);
		currentPrice2.setCurrencyCode("INR");
		currentPrice2.setValue(3123.00);

		Product product1 = new Product();
		product1.setProductId(1235);
		product1.setCurrentPrice(currentPrice1);

		Product product2 = new Product();
		product2.setProductId(1236);
		product2.setCurrentPrice(currentPrice2);

		List<Product> productList = new LinkedList<>();
		productList.add(product1);
		productList.add(product2);

		List<Product> productList1 = productService.saveProducts(productList);
		Assert.assertTrue(productList1.size()==2);
	}

	@Test
	public void testGetProducts(){

		CurrentPrice currentPrice = new CurrentPrice();
		currentPrice.setCurrentPriceId(1);
		currentPrice.setCurrencyCode("USD");
		currentPrice.setValue(999.88);

		Product product = new Product();
		product.setProductId(1234);
		product.setCurrentPrice(currentPrice);

		List<Product> productList = productService.getProducts();
		productList.add(product);
		Assert.assertEquals(1234,productList.get(0).getProductId());
		Assert.assertEquals("USD",productList.get(0).getCurrentPrice().getCurrencyCode());
		Assert.assertEquals(999.89, productList.get(0).getCurrentPrice().getValue().doubleValue(),0.01);
	}

	@Test
	public void testGetProductById(){

		Assertions.assertThrows(ResourceNotFoundException.class,()-> {
			Product product1 = productService.getProductById(1234);
			Assert.assertEquals(1234, product1.getProductId());
		});
	}

	@Test
	public void testDeleteProduct(){

		Assertions.assertEquals("Unable to delete the product || 1234",productService.deleteProduct(1234));
	}

	@Test
	public void testUpdateProductById(){

		CurrentPrice currentPrice = new CurrentPrice();
		currentPrice.setCurrentPriceId(1);
		currentPrice.setCurrencyCode("USD");
		currentPrice.setValue(999.88);

		Product product = new Product();
		product.setProductId(1234);
		product.setCurrentPrice(currentPrice);

		Assertions.assertThrows(ResourceNotFoundException.class,()-> {
			Product newproduct = productService.updateProductById(product,1234);
			Assert.assertEquals(1234, product.getProductId());
		});
	}

}
