package car.common;

public class Carmain {
public static void main(String[] args) {
	
	// 생성자를 호출 할때는
	// 생성자의 매개변수타입에 맞춰서 순서대로 입력 해줘야 합니다.
	
	 Car car =  new Car();
	 System.out.println("car================");  //변수 이름을 꼭 확인하자
	 System.out.println(car.model);
	 System.out.println(car.cloor);
	 System.out.println(car.maxSpeed);
	 
	 
	 Car car1 = new Car("그랜져");
	 System.out.println("car================");
	 System.out.println(car1.model);
	 System.out.println(car1.cloor);
	 System.out.println(car1.maxSpeed);
	 
	 
	 Car car2 = new Car("SM5",200);
	 System.out.println("car================");
	 System.out.println(car2.model);
	 System.out.println(car2.cloor);
	 System.out.println(car2.maxSpeed);
	 
	 
	 Car car3 = new Car("소나타","블랙", 200);
	 
	 System.out.println("car================");
	 System.out.println(car3.model);
	 System.out.println(car3.cloor);
	 System.out.println(car3.maxSpeed);
	 
	 
	 
}
}
