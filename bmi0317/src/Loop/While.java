package Loop;

public class While {
	public static void main(String[] args) {
	
		int sum = 0;
		int i = 0;
		
		// i = 0~99
	while(i<100) {
		
		i++;// 1~100
		sum = sum +i;
		
		System.out.println("while 문" + i);
		
	}	
	System.out.println( "모든수의 합은 " + sum);
		
}
}
