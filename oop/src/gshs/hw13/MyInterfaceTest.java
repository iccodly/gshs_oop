package hw13;

public class MyInterfaceTest {
	public static void main(String[] args) {
		// interface는 직접 객체를 생성할 수 없음
		MyRemoteControl rc = null;
		// 구현 객체를 인터페이스에 대입
		rc = new MyTelevision();
		rc.turnOn();
		rc.setMute(true);

		// Audio Class - Default method overriding
		rc = new MyAudio();
		rc.turnOn();
		rc.setMute(true);
	}
}
