package AmClass;

public class PersonMain {

	public static void main(String[] args) {
		Person2 person = new Person2();
		Person2 hong = new Person2("홍길동",20,175.5,70.7);
		
		System.out.println(person.information());
		System.out.println(hong.information() + "\n");
		
		Person2[] personArr = new Person2[5];
		personArr[0] = new Person2("김지민",20,0,0);
		personArr[1] = new Person2("홍길동",40,0,0);
		personArr[2] = new Person2("나승배",35,0,0);
		personArr[3] = new Person2("박무열",30,0,0);
		personArr[4] = new Person2("정찬성",50,0,0);
		
		//   타입   변수명 :  배열
		for (Person2  p :personArr) {
			System.out.println(p.information());
			System.out.println("=====================");
		}
	}

}
