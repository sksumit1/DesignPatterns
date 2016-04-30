package builder_design_pattern;

import builder_design_pattern.impl.ApartmentBuilder;
import builder_design_pattern.impl.TreeHouseBuilder;

public class MainClass {

	public static void main(String[] args) {
		ConstructionCompanyDirector director = new ConstructionCompanyDirector(new TreeHouseBuilder());
		director.constructHouse();
		System.out.println(director.getProduct());
		ConstructionCompanyDirector director2 = new ConstructionCompanyDirector(new ApartmentBuilder());
		director2.constructHouse();
		System.out.println(director2.getProduct());
	}

}
