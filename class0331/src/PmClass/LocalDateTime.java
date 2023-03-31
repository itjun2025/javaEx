package PmClass;

import java.time.format.DateTimeFormatter;

public class LocalDateTime {
		public static void main(String[] args) {
			
			java.time.LocalDateTime now = java.time.LocalDateTime.now();
			
			/** 
			 *  자바 8부터 날짜, 시간을 나타내는 java.time 패키지를 제공
			 *  
			 *  
			 */
			java.time.LocalDateTime when = java.time.LocalDateTime.of(2021, 5,25,22,30,25);
			
			System.out.println(now);
			System.out.println(when);
			
			System.out.println(now.getYear());
			System.out.println(now.getMonth());
			System.out.println(now.getMonthValue());
			System.out.println(now.getDayOfMonth());
			System.out.println(now.getHour());
			System.out.println(now.getMinute());
			System.out.println(now.getSecond());
			
			java.time.LocalDateTime plus = now.plusDays(1).plusMonths(1).plusYears(1);
			System.out.println("=======================");
			System.out.println(now);
			System.out.println(plus);
			
			System.out.println(now.toLocalDate());
			System.out.println(now.toLocalTime());
			
			System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일hh시mm분ss초")));
			
			System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE));
			
			
			
			
			
			
		}

}
