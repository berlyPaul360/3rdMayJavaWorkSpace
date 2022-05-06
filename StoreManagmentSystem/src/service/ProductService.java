package service;

import java.util.List;

import exceptiom.EmptyStoreException;
import model.ProductPojo;

public interface ProductService {
	
	
	ProductPojo addProduct(ProductPojo productPojo);//create
	
	ProductPojo updateProduct(ProductPojo productPojo);// update
	
	void deleteProduct(int productId);// Delete
	
	List<ProductPojo> getAllProducts()throws EmptyStoreException;//Read 
	
	ProductPojo getAProduct(int productId);//Read
}
