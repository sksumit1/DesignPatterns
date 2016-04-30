package builder_design_pattern.impl;

import builder_design_pattern.Builder;
import builder_design_pattern.HouseProduct;

public class ApartmentBuilder implements Builder {
	
	private HouseProduct product = new HouseProduct();

	@Override
	public void assembleRawMaterial() {
		product.setRawMaterial("Raw material used :: concrete & bricks");
	}

	@Override
	public void layFoundation() {
		product.setFoundation("Foundation : 40 feet deep");
	}

	@Override
	public void construct() {
		product.setConstructionDesc("Constructed in 1 month");
	}

	@Override
	public HouseProduct getProduct() {
		return product;
	}

}
