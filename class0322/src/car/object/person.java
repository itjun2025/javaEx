package car.object;

public class person {

	public static void main(String[] args) {
	 Car car = new Car();
	 car.company = "르노삼성";
	 
	 System.out.println("company : " + car.company);
	 System.out.println("speed : "+ car.speed);
	 car.speedup();
	 System.out.println("car.speedUp()");
	 System.out.println("speed : "+ car.speed);
	 car.speed = 100;
	 System.out.println("car.speedUp()");
	 System.out.println("speed : "+ car.speed);
	 
	}
}
