package model;

public class ProductPojo {
	
	private int productId;
	private String productName;
	private String productDescription;
	private int productCost;
	private String productImageURL;
	
	public ProductPojo() {
		super();
	}
	

	public ProductPojo(int productId, String productName, String productDescription, int productCost,
			String productImageURL) {
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productCost = productCost;
		this.productImageURL = productImageURL;
	}

	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductDescription() {
		return productDescription;
	}
	
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public int getProductCost() {
		return productCost;
	}
	
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	
	@Override
	public String toString() {
		return "ProductPojo [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productCost=" + productCost + "]";
	}
	

}
