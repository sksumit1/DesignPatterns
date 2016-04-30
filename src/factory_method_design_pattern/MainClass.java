package factory_method_design_pattern;

public class MainClass {
	
	public static void main(String[] args) {
		I_Animal animal1 = Factory.getInstance().factoryMethod("cat");
		animal1.makeSound();
		I_Animal animal2 = Factory.getInstance().factoryMethod("dog");
		animal2.makeSound();
	}

}
