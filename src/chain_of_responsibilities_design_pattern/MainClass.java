package chain_of_responsibilities_design_pattern;

import chain_of_responsibilities_design_pattern.impl.PassportValidationHandler;
import chain_of_responsibilities_design_pattern.impl.TicketValidationHandler;
import chain_of_responsibilities_design_pattern.impl.VisaValidationHandler;

public class MainClass {

	public static void main(String[] args) {
		ValidationHandler ticket = new TicketValidationHandler();
		ValidationHandler passport = new PassportValidationHandler();
		ValidationHandler visa = new VisaValidationHandler();
		ticket.setSuccessor(passport);
		passport.setSuccessor(visa);
		TravellingRequest traveller1 = new TravellingRequest(false, false, false);
		System.out.println("Traveller 1");
		try {
			ticket.validate(traveller1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-----------");
		TravellingRequest traveller2 = new TravellingRequest(true, false, false);
		System.out.println("Traveller 2");
		try {
			ticket.validate(traveller2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-----------");
		TravellingRequest traveller3 = new TravellingRequest(true, true, false);
		System.out.println("Traveller 3");
		try {
			ticket.validate(traveller3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-----------");
		TravellingRequest traveller4 = new TravellingRequest(true, true, true);
		System.out.println("Traveller 4");
		try {
			ticket.validate(traveller4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-----------");
	}

}
