package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import exceptiom.EmptyStoreException;
import model.ProductPojo;

public class ProductDaoCollectionImpl implements ProductDao {
	
	List<ProductPojo> allProducts = new ArrayList<>();
	
	

	public ProductDaoCollectionImpl() {
		ProductPojo product1 = new ProductPojo(101,"Apples","Tasty Juicy Apples",10,"");
		ProductPojo product2 = new ProductPojo(102,"Bananas","Delicous Bananas",8,"");
		ProductPojo product3 = new ProductPojo(103,"Oranges","Juicy oranges",5,"");
		allProducts.add(product1);
		allProducts.add(product2);
		allProducts.add(product3);
	}

	@Override
	public ProductPojo addProduct(ProductPojo productPojo) {
		// generates new product ID
		int newProductId = allProducts.get(allProducts.size()-1).getProductId()+1;
		//set it in the product pojo
		productPojo.setProductId(newProductId);
		//all product added to the data source
		allProducts.add(productPojo);
		return productPojo;
	}

	@Override
	public ProductPojo updateProduct(ProductPojo productPojo) {
		for(int i = 0; i < allProducts.size();i++) {
			if(allProducts.get(i).getProductId() == productPojo.getProductId()) {
				allProducts.set(i, productPojo);
				break;		
					
			}
			
		}
		return productPojo;
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		Iterator<ProductPojo> allProductsItr = allProducts.iterator();
		while(allProductsItr.hasNext()) {
			ProductPojo getProduct = allProductsItr.next();
			if(getProduct.getProductId() == productId) {
				allProducts.remove(getProduct);
				break;
			}
		}
	}

	@Override
	public List<ProductPojo> getAllProducts() throws EmptyStoreException{
		if(allProducts.isEmpty()) {
			EmptyStoreException ese = new EmptyStoreException();
			throw ese;
		}
		return allProducts;
	}

	@Override
	public ProductPojo getAProduct(int productId) {
		ProductPojo foundProduct = null;
		for(int i = 0; i < allProducts.size();i++) {
			if(allProducts.get(i).getProductId() == productId) {
				foundProduct = allProducts.get(i);//when found assign to foundProduct variable
				break;		
					
			}
			
		}
		return foundProduct;
	}
}
