package com.myRetail.service;

import com.myRetail.exception.ResourceNotFoundException;
import com.myRetail.model.CurrentPrice;
import com.myRetail.model.Product;
import com.myRetail.repository.ICurrentPriceRepo;
import com.myRetail.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl {

    @Autowired
    private IProductRepo iProductRepo;

    @Autowired
    ICurrentPriceRepo iCurrentPriceRepo;

    //POST method to add a product to database
    public Product saveProduct(Product product){
        iCurrentPriceRepo.save(product.getCurrentPrice());
        return iProductRepo.save(product);
    }

    //POST method to add products to database
    public List<Product> saveProducts(List<Product> productList){
        for(Product product:productList){
            iCurrentPriceRepo.save(product.getCurrentPrice());
        }
        return iProductRepo.saveAll(productList);
    }

    //GET method to retrieve all the products from database
    public List<Product> getProducts() {
        return iProductRepo.findAll();
    }

    //GET method to retrieve product based on ProductId
    public Product getProductById(int productId) {
        return iProductRepo.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with Id : " +productId));
    }

    //DELETE method for deleting product data
    public String deleteProduct(int productId){
        try{
            iProductRepo.deleteById(productId);
            return "Product deleted || "+productId;
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return "Unable to delete the product || " +productId;
    }

    //PUT method for updating product details
    public Product updateProduct(Product product){
        iCurrentPriceRepo.save(product.getCurrentPrice());
        Product existingProduct = iProductRepo.findById(product.getProductId()).orElse(null);
        existingProduct.setProductId(product.getProductId());
        existingProduct.setCurrentPrice(product.getCurrentPrice());
        return iProductRepo.save(existingProduct);
    }

    //PUT method for updating product details based on ProductId
    public Product updateProductById(Product product, int productId) {
        iCurrentPriceRepo.save(product.getCurrentPrice());
        Product existingProduct = iProductRepo.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with Id : " +productId));
        existingProduct.setProductId(product.getProductId());
        existingProduct.setCurrentPrice(product.getCurrentPrice());
        return iProductRepo.save(existingProduct);
    }
}
