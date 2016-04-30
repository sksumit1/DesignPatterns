package observer_design_pattern;

import observer_design_pattern.impl.MobileObserver;
import observer_design_pattern.impl.SmartWatchObserver;
import observer_design_pattern.impl.WeatherStationBroadcasterSubject;

public class MainClass {

	public static void main(String[] args) {
		Subject subject = new WeatherStationBroadcasterSubject();
		Observer observer1 = new MobileObserver();
		subject.addObserver(observer1);
		Message msg = new Message("It's a hot day");
		subject.notifyObservers(msg);
		Observer observer2 = new SmartWatchObserver();
		subject.addObserver(observer2);
		msg = new Message("It's a cold day");
		subject.notifyObservers(msg);
		subject.removeObserver(observer1);
		msg = new Message("It's a cloudy day");
		subject.notifyObservers(msg);
	}

}
