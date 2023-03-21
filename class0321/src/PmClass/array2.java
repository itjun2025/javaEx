package PmClass;

public class array2 {
	public static void main(String[] args) {
		String[] name = new String[3];
		name[0] = new String("java");
		name[1] = new String("java");
		name[2] = "C#";
		
		// 참조 타입에서 == : 참조타입의 변수가 가지고 있는 메모리의 주소를 비교
		// equals : 문자열 자체를 비교
		if (name[0].equals (name[1])) {
			System.out.println("0번방 == 1번방");
		}else {
			System.out.println("0번방 != 1번방");
		}
		
	}

}
