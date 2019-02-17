

public class ButtonFunction {

	Command command;
	
	public ButtonFunction(Command newCommand){
		command = newCommand;
	}
	
	public void buttonPress(){
		
		command.execute();
	}
	
}
