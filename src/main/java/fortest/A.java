package fortest;

public class A {
	public void foo() {
		System.out.println("I’m A");
	}
}
class B extends A {
	public void foo() {
		System.out.println("I’m B");
	}

	public void hey(){
		System.out.println("Hey!");
	}
}

//class Main {
//	public static void main (String ... args) {
//		A a = new B();
//		a.foo();
//		//a.hey();
//	}
//}