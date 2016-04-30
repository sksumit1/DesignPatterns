package chain_of_responsibilities_design_pattern.impl;

import chain_of_responsibilities_design_pattern.TravellingRequest;
import chain_of_responsibilities_design_pattern.ValidationHandler;

public class VisaValidationHandler extends ValidationHandler {

	@Override
	public void validate(TravellingRequest request) throws Exception {
		if(request.isValidVisa()) {
			System.out.println("Congratulations !! You can travel");
		} else {
			throw new Exception("You don't have valid visa, can't travel");
		}

	}

}
