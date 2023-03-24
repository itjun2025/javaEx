package AmClass;

public class SingleTonMain {
	
	public static void main(String[] args) {
		
		SingleTon sing1 = SingleTon.getInstance();
		SingleTon sing2 = SingleTon.getInstance();
		SingleTon sing3 = SingleTon.getInstance();
		SingleTon sing4 = SingleTon.getInstance();
		SingleTon sing5 = SingleTon.getInstance();
		
		// 같은 주소를 갖고 있는지 확인
		if (sing1==sing2) {
			System.out.println("같은 객체입니다");
		}else {
			System.out.println("다른 객체입니다");
		}
	}
}
