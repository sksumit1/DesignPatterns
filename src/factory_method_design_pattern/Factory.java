package factory_method_design_pattern;

import factory_method_design_pattern.imp.Cat;
import factory_method_design_pattern.imp.Dog;


public class Factory {
	
	private static final Factory instance = new Factory();
	
	private Factory() {
		super();
	}

	public static Factory getInstance() {
		return instance;
	}
	
	private I_Animal getAnimal(String name) {
		if(name.equals("cat")) {
			return new Cat();
		} else {
			return new Dog();
		}
	}
	
	public I_Animal factoryMethod(String name) {
		I_Animal animal = getAnimal(name);
		System.out.println("Food served to "+name+" "+animal.getClass().getCanonicalName());
		return animal;
	}

}
