package PmClass;

public class Calcorator {
	// 같은 메소드 명으로 여러개의 오버로딩 만들기
	/**
	 * 정사각형의 넓이 구하기	
	 * @param width
	 * @return width*width
	 */
	public double areaRectangle(double width) {
		return width * width;
	}
	
	/**
	 * 직사각형의 넓이구하기
	 * @param width, height
	 * @param width * height
	 * @return
	 */
	public double areaRectangle(double width, double height) {
		return width * height;
	}
}
