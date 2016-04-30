package adapter_design_pattern;

public class ObjectAdapter implements I_US_IndiaAdapter {
	
	private IUnitedStatesAppliance appliance;

	public ObjectAdapter(IUnitedStatesAppliance appliance) {
		super();
		this.appliance = appliance;
	}

	@Override
	public void charge() {
		appliance.loadPower();
	}

}
