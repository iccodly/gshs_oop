package test;

class A {
	A() {
		System.out.println("A 객체 생성");
	}

	// 인스턴스 멤버 클래스
	class B {
		B() {
			System.out.println("B 객체 생성");
		}

		int field1;
		static int field2;

		void method1() {

		}

		static void method2() {

		}
	}
	
	// 정적 멤버 클래스
	static class C {
		C() {
			System.out.println("C 객제 생성");
		}

		int field1;
		static int field2;

		void method1() {

		}

		static void method2() {

		}
	}
	
	void method() {
		// 로컬 클래스
		class D {
			D() {
				System.out.println("D 객체 생성");
			}

			int field1;
			static int field2;

			void method1() {

			}

			static void method2() {

			}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

	B field1 = new B();
	C field2 = new C();

	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	//static B field3 = new B();
	static C field4 = new C();

}

public class MyNestedClassTest {
	public static void main(String[] args) {

	}
}
