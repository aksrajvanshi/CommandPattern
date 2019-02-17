
public class TVRemote {

	
	public static void main(String []args){
		
		
		ElectronicDevice device = new Television();
		
		turnTVOnCommand tvOn = new turnTVOnCommand(device);
		
		ButtonFunction buttonPress = new ButtonFunction(tvOn);
		
		buttonPress.buttonPress();
		
		
		turnTVOffCommand tvOff = new turnTVOffCommand(device);
		
		buttonPress = new ButtonFunction(tvOff);
		
		buttonPress.buttonPress();
		
	}
	
}
