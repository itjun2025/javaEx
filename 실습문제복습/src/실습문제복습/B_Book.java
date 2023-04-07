package 실습문제복습;

public class B_Book {

	
	private String title;				// 도서명
	private int price;					// 가격
	private double discountRate;		// 할인율
	private String author;				// 저자명
	
	public B_Book() {
		
	}

	public B_Book(String title, int price, double discountRate, String author) {
		super();
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	public String information() {
		 return (getTitle() + " " +getPrice()+ " " + getDiscountRate()+ " " +getAuthor());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public void sale() {
		System.out.println("도서명 : " + getTitle());
		int res =(int) (getPrice() - (getPrice() * getDiscountRate()));
		System.out.println("할인된 가격 :"+(getPrice()-(getPrice()*getDiscountRate())));
	}
	
}
