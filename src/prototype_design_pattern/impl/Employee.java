package prototype_design_pattern.impl;

import prototype_design_pattern.IPerson;

public class Employee implements IPerson, Cloneable{
	
	private String name;
	
	public Employee() {
		//Get employee name from LDAP
		name = "Sumit";
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public IPerson clonePrototype() {
		IPerson clone = null;
		try {
			clone = (IPerson) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}
