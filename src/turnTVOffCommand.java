
public class turnTVOffCommand implements Command {

	ElectronicDevice device;
	
	public turnTVOffCommand(ElectronicDevice newDevice){
		device = newDevice;
	}
	
	@Override
	public void execute() {
		device.turnOff();

	}

}
