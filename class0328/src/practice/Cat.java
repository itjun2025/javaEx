package practice;

public class Cat extends Animal{

	private String location;
	private String color;
	
	public Cat() {
		
	}
	public Cat(String name, String kinds, String location, String color) {
		// 부모의 생성자를 호출하여 필드값을 초기화 해야한다
		super(name, kinds);
		// 필드 초기화
		setLocation(location);
		setColor(color);
	
	}
	@Override
	public void speak() {
		// 방법 1.
		// 부모의 메서드를 호출 super.
		String str = super.toString();
		System.out.println(str+location+ "에서식하며, 색상은 " + color+ "입니다" );
		
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
