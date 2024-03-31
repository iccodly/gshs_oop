package hw9;

public class MyEmployee {
	public String name;
	public int age;

	public MyEmployee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println("* 사원의 이름은 " + this.name + "이고, 나이는 " + this.age + " 입니다.");
	}
}
