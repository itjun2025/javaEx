package AmClass;


public class HttpEx {
	 

	
	public static void main(String[] args) {
		
		method(new Login());
		method(new FIle());
	
		
	}
	public static void method(Http servlet) {
		servlet.service();
	}
	
}
