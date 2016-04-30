package adapter_design_pattern;

import adapter_design_pattern.impl.LaptopFromUSA;

public class ClassAdapter extends LaptopFromUSA implements I_US_IndiaAdapter {

	@Override
	public void charge() {
		this.loadPower();
	}

}
