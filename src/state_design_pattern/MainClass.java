package state_design_pattern;

import state_design_pattern.impl.StandbyState;

public class MainClass {
	
	public static void main(String[] args) {
		Context context = new Context(new StandbyState());
		context.pushPlayButton();
		context.pushPlayButton();
		context.pushPlayButton();
		context.pushPlayButton();
	}

}
