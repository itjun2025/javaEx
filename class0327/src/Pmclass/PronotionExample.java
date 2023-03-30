package Pmclass;
	// 한 페이지에 여려 class 정의 가능
	class A{} 
	
	class B extends A {}  
	class C extends A {} 
	
	class D extends B {}
	class E extends C {}
	public class PronotionExample {
		
		public static void main(String[] args) {
			
			B b = new B();
			C c = new C();
			D d = new D();
			E e = new E();
			
			A a1 = b; // 자동형변환 : 부모타입으로 자동 형번환
			A a2 = c;
			A a3 = d;
			A a4 = e;
			
		
		}
}
