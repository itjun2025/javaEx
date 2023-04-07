package 실습문제복습;

public class B_Application {

		public static void main(String[] args) {
			
			B_Book v = new B_Book();
			System.out.println(v.information());
			
			B_Book b_Book = new B_Book("자바의정석", 20000, 0.2, "윤상섭");
		     System.out.println(b_Book.information());
			
		     v.setTitle("C언어");
		     v.setAuthor("홍길동");
		     v.setDiscountRate(0.1);
		     v.setPrice(30000);
		     
		     System.out.println("수정된 결과확인");
		     System.out.println(v.information());
		     
		     
		    
		     b_Book.sale();
		     v.sale();
		}
}
