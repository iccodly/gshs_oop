package gshs;

public class OverridingTest {
	public static void main(String[] args) {
		Employee employee = new Employee("Kim min", 25);
		Manager manager = new Manager("Lee Joon", 30, "Project Manager");
		employee.print();
		manager.print();
	}
}
