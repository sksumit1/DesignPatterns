package abstract_factory_design_pattern.impl;

import abstract_factory_design_pattern.I_CarPart;

public class Ford_Interiors implements I_CarPart {

	@Override
	public void description() {
		System.out.println("Ford interiors");
	}

}
