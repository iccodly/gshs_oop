package test;

class A {
	int field1;

	void method1() {

	}
	
	static int field2;

	static void method2() {

	}
	
	class B {
		void method() {
			field1 = 10;
			method1();

			field2 = 10;
			method2();
		}
	}

	static class C {
		void method() {
			//field1 = 10;
			//method1();

			field2 = 10;
			method2();
		}
	}
}

public class MyNestedClassAccessTest {
	public static void main(String[] args) {

	}
}
