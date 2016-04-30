package factory_design_pattern;

public class MainClass {
	
	public static void main(String[] args) {
		I_Animal animal1 = Factory.getInstance().getAnimal("cat");
		animal1.makeSound();
		I_Animal animal2 = Factory.getInstance().getAnimal("dog");
		animal2.makeSound();
	}

}
