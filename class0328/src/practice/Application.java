package practice;


public class Application {
	
	public static void main(String[] args) {
		//  Animal 타입의 객체배열 크기 5로 생성
		Animal[] animals = new Animal[5];
		
		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성)
		Dog dog = new Dog("멍멍이", "닥스훈트", 25);
		Cat cat = new Cat("야옹이", "길냥이", "사막", "갈색");
		
		
		// 0~4
		// 배열의 각 방에 고양이 또는 멍멍이를 입력
		for (int i = 0; i < 5; i++) {
			// 0,1
		int index = (int)(Math.random() * 2 );
		if (index==1) {
			// 배열이름[방번호]
			animals[i] = dog;
		}else {
			animals[i]=cat;
		}
			
		}
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출
		for(Animal a : animals) {
			// 자식 객체에서 개정의(오버라이딩) 되어진 메서드가 호출
			a.speak();
		}
		
	}
}
