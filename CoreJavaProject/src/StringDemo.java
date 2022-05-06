
public class StringDemo {

	public static void main(String[] args) {
		
		Room myRoom = new Room(300,200,100);
		String myName = new String("hello");
		String str1 = "hello";//recommended (no need for new keyword because objects pre-built)
		
		
		str1 = "welcome" + str1;
		str1 = "java" + str1;
		str1 = "abc" + str1;
		
		StringBuffer strBuffer = new StringBuffer("hello");
		strBuffer.append("welcome").append("java").append("abc");
		Integer i = 30;
		Object[] obj = new Object[10];
		obj[0] = "yo";

	}

}
