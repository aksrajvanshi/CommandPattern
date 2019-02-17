
public class turnTVOnCommand implements Command {

	ElectronicDevice device;
	
	public turnTVOnCommand(ElectronicDevice newDevice){
		device = newDevice;
	}
	
	@Override
	public void execute() {
		device.turnOn();

	}

}
