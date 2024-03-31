package hw3;

public class CircleArea {
	public static void main(String[] args) {
		final double PI = 3.14; // 원주율을 상수로 선언
		double radius = 10; // 원의 반지름
		double circleArea = 0; // 원의 면적
		circleArea = radius * radius * PI; // 원의 면적 계산
		// 원의 면적을 화면에 출력한다.
		System.out.print("원의 면적 = ");
		System.out.println(circleArea);
	}
}
