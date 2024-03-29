package hw13;

public class Television implements RemoteControl {
	private int volume;

	public void turnOn() {
		System.out.println("TV turn ON");
	}

	public void turnOff() {
		System.out.println("TV turn OFF");
	}

	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Current Audio volume : " + this.volume);
	}
}
