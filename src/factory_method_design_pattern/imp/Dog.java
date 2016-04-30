package factory_method_design_pattern.imp;

import factory_method_design_pattern.I_Animal;

public class Dog implements I_Animal {

	@Override
	public void makeSound() {
		System.out.println("Bark !! I just had food");
	}

}
