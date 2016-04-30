package observer_design_pattern;

public interface Subject {
	public void addObserver(Observer ob);
	public void removeObserver(Observer ob);
	public void notifyObservers(Message msg);
}
