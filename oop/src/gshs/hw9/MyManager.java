package hw9;

public class MyManager extends MyEmployee {
	String JobOfManager;

	public MyManager(String name, int age, String JobOfManager) {
		super(name, age);
		this.JobOfManager = JobOfManager;
	}

	public void print() {
		super.print();
		System.out.println("- 관리자 " + super.name + "의 직함은 " + JobOfManager + " 입니다.");
	}
}
