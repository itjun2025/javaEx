package AmClass;

import java.util.Calendar;

public class FinalMain {

	public static void main(String[] args) {
		Final ex= new Final("123456", "홍길동");
		
		// 상수 필드이 값 변경 X
//		ex.nation= "한국"; --> 오류가 난다
		ex.name =  "홍길동";
		
		System.out.println("파이값 : "+ ex.PI);
		System.out.println("지구 반지름 :"+ ex.EARTH_RADIUS + "km");
		
		
		Calendar cal = Calendar.getInstance();
		// 현재 일을 출력
		int day = cal.get(Calendar.DATE);
		int dat1 = cal.get(5);
		
		System.out.println(cal.get(Calendar.YEAR) + "년");	
		System.out.println(cal.get(Calendar.DATE) + "일");	
		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + "시");	
		System.out.println(cal.get(Calendar.MINUTE) + "분");	
		System.out.println(cal.get(Calendar.SECOND) + "초");	
		
		//실행전
		long before = System.currentTimeMillis();
		long after = System.currentTimeMillis();
		
		
	}
}
