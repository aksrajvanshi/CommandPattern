
public class turnVolumeDown implements Command {

	ElectronicDevice device;
	
	public turnVolumeDown(ElectronicDevice newDevice){
		device = newDevice;
	}
	
	@Override
	public void execute() {
		device.turnVolumeDown();

	}

}
