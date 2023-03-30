package pmclass2;

public class Application {
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = new Bus();
		
		bus.checkFare();
	}
}
