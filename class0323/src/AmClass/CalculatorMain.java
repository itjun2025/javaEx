package AmClass;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator1 calc = new Calculator1();
		
		calc.poweron();
		calc.add(5, 3);
		
		// 매개변수 타입과 갯수가 일치하지 않을때
		// 이름이 다를경우 -- 오류가 난다 
		int res = calc.add(5, 3);
		System.out.println(res);
		
		// 배열을 생성후 메서드의 파라메터로 전달
		int[] numbers = {1,2,3,4,5};
		calc.add(numbers);
		System.out.println("calc.add(numbers) :" + calc.add(numbers));
		
		//메서드를 실행할때 배열을 생성
		calc.add(new int[] {1,2,3});
		System.out.println("calc.add(new int[]{1,2,3} : " + calc.add(new int[] {1,2,3}));
		
		
		System.out.println("calc.addFn :" +calc.addFn(1,2,3,4,5,6,6,4,3,2,42,4,5,252,52));
	}

}
