package PmClass;

public class CalculatorMain {
	
	public static void main(String[] args) {
		Calcorator calc =  new Calcorator() ;
			// 정사각형의 넓이
			double rectangle = calc.areaRectangle(10);
			System.out.println("정사각형의 넓이 :"+ rectangle);
			
			// 직사각형의 넓이
			
			System.out.println("직사각형의 넓이 :" + calc.areaRectangle(10, 20));
		
		
	}
}
