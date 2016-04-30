package abstract_factory_design_pattern.impl;

import abstract_factory_design_pattern.I_CarPart;
import abstract_factory_design_pattern.I_Factory;

public class Ford_Factory implements I_Factory {
	
	private static final I_Factory instance = new Ford_Factory();
	
	private Ford_Factory() {
		super();
	}

	public static I_Factory getInstance() {
		return instance;
	}

	@Override
	public I_CarPart getPart(String partName) {
		if(partName.equals("body")) {
			return new Ford_Body();
		} else {
			return new Ford_Interiors();
		}
	}

}
