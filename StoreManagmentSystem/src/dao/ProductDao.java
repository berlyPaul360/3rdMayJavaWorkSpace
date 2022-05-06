package dao;

import java.util.List;

import exceptiom.EmptyStoreException;
import model.ProductPojo;

public interface ProductDao {
	
	//4 CRUD Methods 
	ProductPojo addProduct(ProductPojo productPojo);//create
	
	ProductPojo updateProduct(ProductPojo productPojo);// update
	
	void deleteProduct(int productId);// Delete
	
	List<ProductPojo> getAllProducts() throws EmptyStoreException;//Read 
	
	ProductPojo getAProduct(int productId);//Read
	

}
