
public class Television implements ElectronicDevice {

	private int defaultVolume = 5;
	
	@Override
	public void turnOff() {
		System.out.println(" TV is turned OFF");

	}

	@Override
	public void turnOn() {
		System.out.println(" TV is turned ON");

	}

	@Override
	public void turnVolumeUp() {
		defaultVolume++;
		System.out.println(" TV volume now: " + defaultVolume);

	}

	@Override
	public void turnVolumeDown() {
		defaultVolume--;
		System.out.println(" TV volume now: " + defaultVolume);

	}

}
