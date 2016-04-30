package builder_design_pattern;

public class ConstructionCompanyDirector {
	
	private Builder builder = null;
	
	public ConstructionCompanyDirector(Builder builder) {
		this.builder = builder;
	}
	
	public void constructHouse() {
		this.builder.assembleRawMaterial();
		this.builder.layFoundation();
		this.builder.construct();
	}
	
	public HouseProduct getProduct() {
		return this.builder.getProduct();
	}

}
