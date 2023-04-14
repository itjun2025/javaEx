package com.library.vo;

public class BookVo {

		int bookNo;
		String titleString;
		String author;
		String rentYN;
		
		public BookVo(int bookNo, String titleString, String author, String rentYN) {
			this.bookNo = bookNo;
			this.titleString = titleString;
			this.author = author;
			this.rentYN = rentYN;
		}
		
		@Override
		public String toString() {
			String str =  getRentYN().equals("Y")? "대여중":"";
			
		return getBookNo() 
					+" "+ getTitleString() 
					+" "+ getAuthor()
					+" "+str;
		}

		public int getBookNo() {
			return bookNo;
		}

		public void setBookNo(int bookNo) {
			this.bookNo = bookNo;
		}

		public String getTitleString() {
			return titleString;
		}

		public void setTitleString(String titleString) {
			this.titleString = titleString;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getRentYN() {
			return rentYN;
		}

		public void setRentYN(String rentYN) {
			this.rentYN = rentYN;
		}
}
