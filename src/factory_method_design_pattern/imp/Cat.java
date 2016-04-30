package factory_method_design_pattern.imp;

import factory_method_design_pattern.I_Animal;

public class Cat implements I_Animal {

	@Override
	public void makeSound() {
		System.out.println("Meaow !! I just had food");
	}

}
