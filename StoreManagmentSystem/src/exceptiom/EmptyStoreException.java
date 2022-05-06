package exceptiom;

public class EmptyStoreException extends Exception{

	@Override
	public String getMessage() {
		
		return "Store is Empty!";
	}
	
	

}
