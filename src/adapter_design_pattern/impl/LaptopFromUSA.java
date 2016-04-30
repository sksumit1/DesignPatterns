package adapter_design_pattern.impl;

import adapter_design_pattern.IUnitedStatesAppliance;

public class LaptopFromUSA implements IUnitedStatesAppliance{

	@Override
	public void loadPower() {
		System.out.println("Charging the laptop from United States");
	}

}
