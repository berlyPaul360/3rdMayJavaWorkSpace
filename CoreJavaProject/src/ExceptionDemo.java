
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 5;
			int b = 0;
			int c = 0;
			
			System.out.println("going to divide");
			try {
				c = a/b;
			} catch (ArithmeticException e) {
				e.printStackTrace();
				System.out.println("exception while dividing, fixing it");
				b = 1;
				c= a/b;
			}
			
			//1. JVM IIdentifies the type of exception
			//2. creates  an obj of the exception
			//3. implisitly throws the object automatically
			System.out.println(c);
			
			System.out.println("Division Over");
			
			if(b!=0) {
				c = a/b;
				System.out.println(c);
			}
	}

}
