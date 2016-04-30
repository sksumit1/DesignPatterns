package observer_design_pattern.impl;

import observer_design_pattern.Message;
import observer_design_pattern.Observer;

public class SmartWatchObserver implements Observer {

	@Override
	public void update(Message msg) {
		System.out.println("Smart Watch Observer : Weather data changed :: "+msg.getMessage());
	}

}
