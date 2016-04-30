package builder_design_pattern;

public interface Builder {
	
	public void assembleRawMaterial();
	public void layFoundation();
	public void construct();
	public HouseProduct getProduct();

}
