package PmClass;

public class CalculatorMain {           // 직접 만든 메서드를 사용하기
	public static void main(String[] args) {
	  //             타입변수명 = new 타입();	
		Calculator calc = new Calculator();
		int res = calc.add(8, 2);
		System.out.println("두수의 합은 "+ res);
		
		Calculator2 calcula = new Calculator2();
		int sum = calcula.minus(8, 2);
		System.out.println("두수의 차는 "+ sum);
		
		Calculator2 calcu = new Calculator2();
		int box = calcu.xxx(8, 2);
		System.out.println("두수의 곱은" + box);
		
		Calculator2 moon = new Calculator2();
		int book = moon.dos(8, 2);
		System.out.println("두 수를 나누면" + book);
		
		Calculator2 star = new Calculator2();
		int boat = star.nos(8, 3);
		System.out.println("두 수의 나머지 연산은" + boat);
		
		
	}
	
}
