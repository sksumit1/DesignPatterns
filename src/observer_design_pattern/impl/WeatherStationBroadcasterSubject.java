package observer_design_pattern.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import observer_design_pattern.Message;
import observer_design_pattern.Observer;
import observer_design_pattern.Subject;

public class WeatherStationBroadcasterSubject implements Subject {
	
	private Set<Observer> observerList = new HashSet<Observer>();

	@Override
	public void addObserver(Observer ob) {
		observerList.add(ob);
	}

	@Override
	public void removeObserver(Observer ob) {
		observerList.remove(ob);
	}

	@Override
	public void notifyObservers(Message msg) {
		Iterator<Observer> it = observerList.iterator();
		while(it.hasNext()) {
			it.next().update(msg);
		}
	}

}
