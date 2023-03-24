package package1;

import package2.C;

public class A {

	// 필드를 정의
	C c = new C();
	B b=new B();
	// 기능 정의
	public void method1() {

		C c = new C();
		c.method1();
//		c.method2();       private여서 사용불가능
	}

	class B {
		// default일 경우 같은 패키지에서 호출 가능
		B() {

		}
	}

}
