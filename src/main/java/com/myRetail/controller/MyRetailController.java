package com.myRetail.controller;

import com.myRetail.model.Product;
import com.myRetail.service.ProductServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/myRetail")
public class MyRetailController {

    @Autowired
    private ProductServiceImpl productServiceImpl;

    private static final Logger log = LoggerFactory.getLogger(MyRetailController.class);

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        log.info("-----Calling the POST method to add a product to database-----");
        return productServiceImpl.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        log.info("-----Calling the POST method to add a products to database-----");
        return productServiceImpl.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts(){
        log.info("-----Calling the GET method to retrieve all products from database-----");
        return productServiceImpl.getProducts();
    }

    @GetMapping("product/{productId}")
    public Product findProductById(@PathVariable int productId){
        log.info("-----Calling the GET method retrieve a product based on Id from database-----");
        return productServiceImpl.getProductById(productId);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        log.info("-----Calling the PUT method to update an existing product in database-----");
        return productServiceImpl.updateProduct(product);
    }

    @PutMapping("/updateProductById/{productId}")
    public Product updateProductById(@RequestBody Product product, @PathVariable int productId){
        log.info("-----Calling the PUT method to update an existing product in database based on Id-----");
        return productServiceImpl.updateProductById(product, productId);
    }

    @DeleteMapping("/delete/{productId}")
    public String deleteProduct(@PathVariable int productId){
        log.info("-----Calling the DELETE method to delete a product based on Id from database-----");
        return productServiceImpl.deleteProduct(productId);
    }
}
