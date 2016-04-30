package factory_design_pattern;

import factory_design_pattern.impl.Cat;
import factory_design_pattern.impl.Dog;

public class Factory {
	
	private static final Factory instance = new Factory();
	
	private Factory() {
		super();
	}

	public static Factory getInstance() {
		return instance;
	}
	
	public I_Animal getAnimal(String name) {
		if(name.equals("cat")) {
			return new Cat();
		} else {
			return new Dog();
		}
	}

}
