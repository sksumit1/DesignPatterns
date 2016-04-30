package adapter_design_pattern;

import adapter_design_pattern.impl.LaptopFromUSA;

public class MainClass {

	public static void main(String[] args) {
		I_US_IndiaAdapter objectAdapter = new ObjectAdapter(new LaptopFromUSA());
		System.out.println("Using Object Adapter to charge");
		objectAdapter.charge();
		I_US_IndiaAdapter classAdapter = new ClassAdapter();
		System.out.println("Using Class Adapter to charge");
		classAdapter.charge();
	}

}
