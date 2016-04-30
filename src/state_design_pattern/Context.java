package state_design_pattern;

public class Context {
	
	private State state;

	public Context(State state) {
		super();
		this.state = state;
	}
	
	public void setState(State state) {
		this.state = state;
	}

	public void pushPlayButton() {
		state.pressPlay(this);
	}

}
