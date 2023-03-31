package AmClass;

import java.util.HashMap;

public class ObjectEx03 {
	 public static void main(String[] args) {
	
		 HashMap<Key, String> keymap = new HashMap<>();
		 Key key = new Key(1);
		 Key key2 = new Key(2);
		 Key key3 = new Key(1);
		 
		 System.out.println("키 == 키3 : "+key.equals(key3));
		 keymap.put(key, "홍길동");
		 keymap.put(key2, "나잘난");
		 keymap.put(key3, "너잘난");
		 
		 System.out.println(keymap.get(key));
		 System.out.println(keymap.get(key2));
		 System.out.println(keymap.get(key3));
		 
		
	}
	 
	 
	 public void checkEquals() {
		 

		 Key key1 = new Key(1);
		 Key key2 = new Key(1);
		 
		System.out.println("key1");
		System.out.println(key1.hashCode()); 
		System.out.println(Integer.toHexString(key1.hashCode()));
		System.out.println(key1.toString());
		System.out.println("===================================");
		
		System.out.println("key2");
		System.out.println(key2.hashCode()); 
		System.out.println(Integer.toHexString(key2.hashCode()));
		System.out.println(key2.toString());
		  
		System.out.println( "key1과 key 2 가 같니? :"+key1.equals(key2));
		
	 }
}
