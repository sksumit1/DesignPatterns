package state_design_pattern.impl;

import state_design_pattern.Context;
import state_design_pattern.State;

public class PausedState implements State {

	@Override
	public void pressPlay(Context context) {
		System.out.println("Pausing music");
		context.setState(new PlayingState());
	}

}
