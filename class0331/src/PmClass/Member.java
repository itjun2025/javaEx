package PmClass;

public class Member {

	private String id;
	private String name;
	
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	// toString 재정의
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+ ": " + name;
	}
	
	
}
