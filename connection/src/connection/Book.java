package connection;

import java.sql.Date;

public class Book {

	int no ;
	String title;
	String author ;
	String isRentString; 
	Date regDate;
	
	public Book(int no, String title, String author, String isRentString, Date regDate, Date editDate) {
		super();
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRentString = isRentString;
		this.regDate = regDate;
		this.editDate = editDate;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNo() +" "+ getTitle()+" "+getAuthor()
					+" "+getIsRentString()+" "+getRegDate()+" "+getEditDate();
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsRentString() {
		return isRentString;
	}
	public void setIsRentString(String isRentString) {
		this.isRentString = isRentString;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getEditDate() {
		return editDate;
	}
	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}
	Date editDate;
}

