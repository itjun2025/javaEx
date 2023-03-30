package AmClass;

import java.io.IOException;

public class B_Throw {
	
	public static void main(String[] args) throws Exception {
		B_Throw a = new B_Throw();
	
		
		a.method2();
	}
	
	public void method1() throws IOException, Exception, NullPointerException, Exception {
		System.out.println("method1() 호출");
		// 1~3까지 수를 추출
		int num =(int)(Math.random()*3+1);
		if (num==1) {
			throw new Exception();
		}else if(num==2) {
			throw new IOException();
		}else if(num==3) {
			throw new NullPointerException();
		}
	}
	
	public void method2() {
		System.out.println("method1() 호출");
		try {
			method1();
		} catch (IOException e) {
			// 어떤 종류의 예외가 발생했는지 확인후 처리
			System.out.println("파일 입출력 도중 오류 발생");
		} catch (Exception e) {
			// Exception은 예외의 최상위 계층이므로 어떤 오류 발생했는지
			// 명확하게 알 수가 없다
			System.out.println("오류가 발생");
		}
		System.out.println("method1() 종료");
	}
	
	public void method3() {
		
	}
}