package AmClass;



public class Member {
	public static void main(String[] args) {
		
		Member member1 = new Member();
		
		System.out.println("===================================");
		/**
		 * hashCode()
		 * 객체를 식별하는 하나의 정수값
		 * Object 클래스의 객체 해시코드 메소드는 객체 메모리 번지를 이용하여
		 * 해시코드를 만들어 리청 합니다.
		 * ==> 객체마다 다른 값을 가집니다
		 * 두 객체가 동등한지 비교하는데 사용되어 집니다.
		 */
		System.out.println(member1.hashCode());
		// 16진수로 변환
		String str = Integer.toHexString(member1.hashCode());
		System.out.println("hastCode() 16.진수로 변환" + str);
		
		System.out.println(member1.toString());
		
		System.out.println("===================================");
		
	}
}
