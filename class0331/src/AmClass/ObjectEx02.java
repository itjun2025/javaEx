package AmClass;

import java.util.HashMap;

public class ObjectEx02 {
	
	public static void main(String[] args) {
		/**
		 * 		    타입, 타입
		 * HashMap<key, value>
		 * 
		 * 해쉬맵 선언부 
		 * HashMap<String , String> HashMap = new HashMap<>();
		 * 
		 * 해쉬맵 데이터를 담음
		 * HashMap.put("키", "value");
		 * 
		 * 해쉬맵 데이터를 꺼냄
		 * 		String str =  HashMap.get("key");
		 * 동일한 키가 저장될 수 없다
		 * 이미 존재하는 키를 이용해 데이터를 담을 경우 덮어쓰기
		 * 
		 * 
		 */
		HashMap<String , String> HashMap = new HashMap<>();
		// 데이터를 담는 방범
		HashMap.put("key", "value");
		HashMap.put("key1", "value1");
		HashMap.put(new String("key"), "newvalue");
		
		// 데이터를 꺼내는 방법
		String str =  HashMap.get("key");
		System.out.println(str);
		
		System.out.println("key : " + HashMap.get("key"));
		System.out.println("key1 : " + HashMap.get("key1"));
		System.out.println("key2 : " + HashMap.get("key2"));
		
		
		
		
	}
}
