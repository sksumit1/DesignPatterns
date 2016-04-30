package state_design_pattern.impl;

import state_design_pattern.Context;
import state_design_pattern.State;

public class StandbyState implements State {

	@Override
	public void pressPlay(Context context) {
		System.out.println("Playing music from start");
		context.setState(new PlayingState());
	}

}
