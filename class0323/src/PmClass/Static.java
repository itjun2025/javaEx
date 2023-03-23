package PmClass;

public class Static {
	
	public static String name;
	
	// static 정적멤버 - 프로그램 시작 동시에 생성됨
	public static void main(String[] args) {
		Static ex = new Static();
		System.out.println(name);
	}

}
