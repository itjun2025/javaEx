package Loop;

public class NineNine {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			System.out.println("========== "+ i +" 단========");
		for (int n = 1; n < 10; n++) {
				
				sum = i * n;
				System.out.println(i + "x" + n + "=" + (sum));
			}
			
		}
		System.out.println("종료");
	}
}
