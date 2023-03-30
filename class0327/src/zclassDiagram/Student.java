package zclassDiagram;

public class Student extends Person{

	private int grade;
	private String major;
	
	public Student() {
		
	}
	// 초기화 : 생성자의 매개변수를 필드에 입력합니다.
	public Student(String name, int age, double height
					, double weight, int grade, String major) {
		// 부모의 생성자를 호출 합니다.
		super(age,height,weight);
		// super.age; --> private 이기때문에 접근이 불가능함 고로 super()사용
		super.name=name;  	// protected이기 때문에 접근 가능
		this.grade=grade;
		this.major=major;
	}
	// 메서드
	@Override
	public String information() {
		return super.information()
				+ " " + getGrade()
				+ " " + getMajor();
	}

	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}
