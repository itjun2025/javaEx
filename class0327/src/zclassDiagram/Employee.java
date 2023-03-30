package zclassDiagram;

public class Employee extends Person {

	private int salary;
	private String dept;
	
	public Employee() {
		
	}
	// 초기화
	public Employee(String name, int age, double height
			, double weight, int salary, String dept) {
		// 부모생성자는 첫번째 줄에서 호출
		super(age,height,weight);
		super.name=name;
		// this.name=name; 이방식으로도 사용 가능
		setSalary(salary);
		setDept(dept);
//		this.name=name;
//		this.dept=dept;
//		this.salary=salary;
		
		
	}
	
	public String information() {
		// 부모메서드 호출결과 반환된 String 값에
		// 자식필드의 값을 추가하여 반환
		return super.information() 
				+ " "+ getSalary() 
				+" "+ getDept();
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}

