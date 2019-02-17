
public class turnVolumeUp implements Command {

	ElectronicDevice device;
	
	public turnVolumeUp(ElectronicDevice newDevice){
		device = newDevice;
	}
	
	@Override
	public void execute() {
		device.turnVolumeUp();

	}

}
