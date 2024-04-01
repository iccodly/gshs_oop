package hw13;

public interface MyRemoteControl {
	public static final int MAX_VOLUME = 100;
	public static final int MIN_VOLUME = 0;

	default void turnOn() {
		System.out.println("turn ON");
	}

	default void turnOff() {
		System.out.println("turn OFF");
	}

	default void setVolume(int volume) {
		return;
	}

	default void setMute(boolean mute) {
		if (mute == true) {
			System.out.println("무음 처리 합니다.");
		} else {
			System.out.println("무음 해제 합니다.");
		}
	}

	static void changeBattery() {
		System.out.println("배터리 교환합니다.");
	}
}
