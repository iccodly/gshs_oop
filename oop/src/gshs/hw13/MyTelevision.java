package hw13;

public class MyTelevision implements MyRemoteControl {
	private int volume;

	public void turnOn() {
		System.out.println("TV turn ON");
	}

	public void turnOff() {
		System.out.println("TV turn OFF");
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
