package car.object;

public class Member {
 
	String name;
	String id;
	String password;
	int age;
	
	public static void main(String[] args) {
		Member member = new Member();
		
		member.name = "최하얀";
		member.age = 23;
		
		System.out.println(member.name);
		System.out.println(member.age);
		System.out.println(member.password);
		
	}
	
}

