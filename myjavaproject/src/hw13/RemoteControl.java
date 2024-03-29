package hw13;

public interface RemoteControl {
	static final int MAX_VOLUME = 100;
	static final int MIN_VOLUME = 0;

	default void turnOn() {
		System.out.println("turn ON");
	}

	default void turnOff() {
		System.out.println("turn OFF");
	}

	default void setMute(boolean mute) {
		if(mute == true) {
			System.out.println("무음 처리 합니다.");
		} else {
			System.out.println("무음 해제 합니다.");
		}
	}

	public static void changeBattery() {
		System.out.println("배터리 교환합니다.");
	}
}
