package PmClass2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

		public static void main(String[] args) {
			List<String> list = new  ArrayList<String>();
			
			// list 에 저장
			list.add("Java");
			list.add("JDBC");
			list.add("Serclet/JSP");
			list.add("myBATIS");
			
			// 인덱스 추가하기
			list.add(2, "Database");
			
			// 인덱스 지우기
			list.remove(1);
			
			// 인덱스 수정하기
			list.set(2, "oracle");
			
			// list에 저장된 총 갯수
			int size = list.size();
			System.out.println("총 갯수 : "+ size);
			System.out.println("====================");
			
			// list에 저장된 객체 얻기
			String str = list.get(0);
			String str1 = list.get(2);
			System.out.println("0번 인덱스 :" + str);
			System.out.println("2번 인덱스 :" + str1);
			
			System.out.println("\n====================\n");
			for (int i = 0; i < list.size()	; i++) {
				str = list.get(i);
				System.out.println(i + " : " + str);
			}
			System.out.println("\n====================\n");
			
			int i = 0;
			for(String s : list) {
				System.out.println(i + ":" + s);
			}
			
			
		}
}
