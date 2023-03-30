package PmClass2;


public class Library {
	
	// 책 리스트
	
	private Book[] bookArry= new Book[5];
	
	/**
	 * 책 리스트를 추가하는 메서드
	 */
		public void addBook() {
			bookArry[0] = new Book("혼공자","신용권");
			bookArry[1] = new Book("자바의정석","신차용");
			bookArry[2] = new Book("doit", "신용박");
			bookArry[3] = new Book("아저씨", "박용권");
			bookArry[4] = new Book("아줌마", "정용권");
			
		}
	
	
		// to string 재정의
		@Override
		public String toString() {
			String str = "";
			for(Book b: bookArry) {
				str += b.getTitle() + " " + b.getAuthor() +"\n";
			}
			return str;
		}
	}

