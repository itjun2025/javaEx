package AmClass;

public class CalculatorMain {

	public static void main(String[] args) {
		
		// Calculator 객체를 생성후 주소값을 반환
		Calculator calc = new Calculator();
		
		System.out.println("=================");
		
//		System.out.println(calc.name);
//		calc.name = "실수계산기";
//		System.out.println("calc.name : "+calc.name); // 외부에서 이름 변경 가능
	
		
		// . : 주소접근연산자
		// calc.add(5,7);
		System.out.println(+calc.add(5,7));
		
		// 재사용할때는 변수에 담아줍니다
		int addRes  = calc.add(5,7);
		System.out.println(addRes);
	}
}
