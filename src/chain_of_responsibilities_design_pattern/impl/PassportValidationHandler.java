package chain_of_responsibilities_design_pattern.impl;

import chain_of_responsibilities_design_pattern.TravellingRequest;
import chain_of_responsibilities_design_pattern.ValidationHandler;

public class PassportValidationHandler extends ValidationHandler {

	@Override
	public void validate(TravellingRequest request) throws Exception {
		if(request.isValidPassport()) {
			this.successor.validate(request);
		} else {
			throw new Exception("You don't have valid passport, can't travel");
		}

	}

}
