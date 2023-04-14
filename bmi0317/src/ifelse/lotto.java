package ifelse;

public class lotto {

	public static void main(String[] args) {
		// 1 부터 45 까지의 수중에서
		// 무작위로 5개의 숫자를 출력
		// 카운트 : 숫자를 출력할때마다 1씩 증가
		
		int i = 0;
		while(true) {
			int num = (int)(Math.random() * 45 +1 );
		    boolean res = false;

			System.out.print(num + " ");
			
			// 카운트
			i++;
			
			if (i==6) {
				break;
			}
			
		}
		
		
		
	}
}
