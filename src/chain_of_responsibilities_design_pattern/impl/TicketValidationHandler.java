package chain_of_responsibilities_design_pattern.impl;

import chain_of_responsibilities_design_pattern.TravellingRequest;
import chain_of_responsibilities_design_pattern.ValidationHandler;

public class TicketValidationHandler extends ValidationHandler {

	@Override
	public void validate(TravellingRequest request) throws Exception {
		if(request.isValidTicket()) {
			this.successor.validate(request);
		} else {
			throw new Exception("You don't have valid ticket, can't travel");
		}

	}

}
