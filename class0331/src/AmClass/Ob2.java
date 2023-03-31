package AmClass;

import java.util.HashMap;

public class Ob2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1 , "홍길동");
		hashMap.put(2 , "나잘난");
		hashMap.put(3 , "너잘난");
		
		String str =  hashMap.get(1);
		System.out.println(str);
		
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.get(2));
		System.out.println(hashMap.get(3));
		System.out.println(hashMap.get(4));
	}
}
