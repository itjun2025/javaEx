package practice;

public abstract class Animal {
	
	private String name;
	private String kinds;
	
	protected Animal() {
		
	}
	protected Animal(String name, String kind) {
		// 초기화 한다
		this.name=name;
		this.kinds=kind;
	}
	
	public String toString() {
		// 리턴 - 이 메소드를 호출했을때 반환한다는 의미 / 출력과 다르다
		return "저의 이름은"+ name+ "이고, 종류는" + kinds + "입니다.";
	}
	
	//클래스가 추상메서드를 포함할 경우 추상 클래스가 되어야 함
	public abstract void speak(); 
		
	
}
