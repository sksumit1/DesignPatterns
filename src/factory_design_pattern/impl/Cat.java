package factory_design_pattern.impl;

import factory_design_pattern.I_Animal;

public class Cat implements I_Animal {

	@Override
	public void makeSound() {
		System.out.println("Meaow");
	}

}
