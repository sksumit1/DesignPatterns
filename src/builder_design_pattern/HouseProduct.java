package builder_design_pattern;

public class HouseProduct {
	
	private String rawMaterial;
	private String foundation;
	private String constructionDesc;
	
	public String getRawMaterial() {
		return rawMaterial;
	}
	public void setRawMaterial(String rawMaterial) {
		this.rawMaterial = rawMaterial;
	}
	public String getFoundation() {
		return foundation;
	}
	public void setFoundation(String foundation) {
		this.foundation = foundation;
	}
	public String getConstructionDesc() {
		return constructionDesc;
	}
	public void setConstructionDesc(String constructionDesc) {
		this.constructionDesc = constructionDesc;
	}
	
	@Override
	public String toString() {
		return "------\n"+rawMaterial+"\n"+foundation+"\n"+constructionDesc+"\n--------\n";
	}

}
