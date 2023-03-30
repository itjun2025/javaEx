package practice;
//Dog 형식은 상속된 추상 메서드 Animal을 구현해야 합니다. 오버라이딩 해야댐
public class Dog extends Animal {

	public static final String PLACE = "애견카페";
	private int weight;
	
	public Dog(){
		
	}
	
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		setWeight(weight);
	}
	
	@Override
	public void speak() {
		// 방법 2 
		// 부모의 메서드를 호출한다 super.toString(); 사용
		System.out.println(super.toString() + "몸무게는 " + weight + "kg 입니다.");
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}


	
}
