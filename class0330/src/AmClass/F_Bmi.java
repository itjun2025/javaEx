package AmClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class F_Bmi {
	public static void main(String[] args) {
			F_Bmi f = new F_Bmi();
			
			
		Scanner scanner = new Scanner(System.in);
		
		double height, weight;
		
		
		// 사용자가 숫자를 입력할때까지 계속 반복
		while(true) {
			
			try {
				// 숫자를 받아옵니다.
				System.out.println("키를 입력해주세요(m)");
				height =scanner.nextDouble();
				
				// 유효범위를 초과한 경우 오류
				if (height>3) {
					System.err.println("키는 3m를 넘길 수 없습니다");
					continue;
				} else {
					
					break;
				}
				
			} catch (InputMismatchException e) {
				String str = scanner.next();
				System.err.println(str+ "입력할 수 없습니다. \n 숫자를 입력해주세요");
			}
		}
		
		while(true) {
			
			try {
				// 숫자를 받아옵니다.
				System.out.println("몸무게를 입력해주세요(kg)");
				weight =scanner.nextDouble();
				if (weight>200 || weight<20) {
					System.err.println("몸무게는 20보다크고 200보다 작은값을 입력해야 합니다");
					continue;
				}
				break;
				
			} catch (InputMismatchException e) {
				String str = scanner.next();
				System.out.println(str+ "입력할 수 없습니다 \n 숫자를 입력해주세요");
			}
		}
		System.out.println("키 : " + height);
		System.out.println("몸무게  : "+ weight);
		double bmi = weight/(height*height);
		System.out.println("당신의 BMI는 : " + bmi + "입니다.");
		
		
		
			
			
	}
	
}
