package hw9;

public class MyOverridingTest {
	public static void main(String[] args) {
		MyEmployee employee = new MyEmployee("Kim min", 25);
		MyManager manager = new MyManager("Lee Joon", 30, "Project Manager");
		employee.print();
		manager.print();
	}
}
