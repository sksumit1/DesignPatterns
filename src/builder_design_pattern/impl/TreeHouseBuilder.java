package builder_design_pattern.impl;

import builder_design_pattern.Builder;
import builder_design_pattern.HouseProduct;

public class TreeHouseBuilder implements Builder {
	
	private HouseProduct product = new HouseProduct();

	@Override
	public void assembleRawMaterial() {
		product.setRawMaterial("Raw material used :: wood");
	}

	@Override
	public void layFoundation() {
		product.setFoundation("Foundation : Tree trunk 20 feet high");
	}

	@Override
	public void construct() {
		product.setConstructionDesc("Constructed in 10 days");
	}

	@Override
	public HouseProduct getProduct() {
		return product;
	}

}
