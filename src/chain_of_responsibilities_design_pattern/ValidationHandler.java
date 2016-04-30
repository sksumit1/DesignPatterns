package chain_of_responsibilities_design_pattern;

public abstract class ValidationHandler {
	
	protected ValidationHandler successor;
	
	public void setSuccessor(ValidationHandler vh) {
		this.successor = vh;
	}
	public abstract void validate(TravellingRequest request) throws Exception;

}
