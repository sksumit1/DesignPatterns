package observer_design_pattern.impl;

import observer_design_pattern.Message;
import observer_design_pattern.Observer;

public class MobileObserver implements Observer {

	@Override
	public void update(Message msg) {
		System.out.println("Mobile Phone Observer : Weather data changed :: "+msg.getMessage());
	}

}
