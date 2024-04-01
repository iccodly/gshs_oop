package hw13;

public class MyAudio implements MyRemoteControl {
	private int volume;
	private boolean mute;

	public void turnOn() {
		System.out.println("Audio turn ON");
	}

	public void turnOff() {
		System.out.println("Audio turn OFF");
	}

	public void setMute(boolean mute) {
		if (this.mute == mute) {
			return;
		}
		if (mute == true) {
			System.out.println("무음 처리 합니다.");
			this.volume = 0;
			this.mute = true;
		} else {
			System.out.println("무음 해제 합니다.");
			this.mute = false;
		}
	}

	public void setVolume(int volume) {
		if (volume > MyRemoteControl.MAX_VOLUME) {
			this.volume = MyRemoteControl.MAX_VOLUME;
		} else if (volume < MyRemoteControl.MIN_VOLUME) {
			this.volume = MyRemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Current Audio volume : " + this.volume);
	}
}
