package PmClass;
// Math 클래스의 다양한 메소드
public class MathEx {

		public static void main(String[] args) {
			
			// 절대값
			int i = Math.abs(-5);
			double d = Math.abs(-5.423);
			System.out.println("절대값 : " + i);
			System.out.println("절대값 : " + d);
			
			// 소수점 버림
			System.out.println("버림 : " + Math.floor(d));
			
			// 소수점 올림
			System.out.println("올림 : " + Math.ceil(d));
			
			// 소수점 반올림
			System.out.println("반올림 : " + Math.round(d));
			
			// 최대값
			System.out.println(Math.max(5.3, 2.5));
			
			//최소값
			System.out.println(Math.min(5.3, 2.5));
		}
}
