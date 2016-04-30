package chain_of_responsibilities_design_pattern;

public class TravellingRequest {
	
	private boolean validTicket;
	private boolean validPassport;
	private boolean validVisa;
	
	public TravellingRequest(boolean validTicket, boolean validPassport,
			boolean validVisa) {
		super();
		this.validTicket = validTicket;
		this.validPassport = validPassport;
		this.validVisa = validVisa;
	}

	public boolean isValidTicket() {
		return validTicket;
	}

	public boolean isValidPassport() {
		return validPassport;
	}

	public boolean isValidVisa() {
		return validVisa;
	}

}
