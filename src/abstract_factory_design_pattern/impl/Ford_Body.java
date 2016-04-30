package abstract_factory_design_pattern.impl;

import abstract_factory_design_pattern.I_CarPart;

public class Ford_Body implements I_CarPart {

	@Override
	public void description() {
		System.out.println("Ford body");
	}

}
