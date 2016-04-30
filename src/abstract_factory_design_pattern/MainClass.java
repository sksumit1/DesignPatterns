package abstract_factory_design_pattern;

public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("Assembling ford car");
		I_Factory factory = AbstractFactory.getInstance().getFactory("ford");
		factory.getPart("body").description();
		factory.getPart("interiors").description();
		System.out.println("Assembling BMW car");
		factory = AbstractFactory.getInstance().getFactory("BMW");
		factory.getPart("body").description();
		factory.getPart("interiors").description();
	}

}
