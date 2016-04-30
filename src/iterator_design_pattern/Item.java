package iterator_design_pattern;

public class Item {
	
	private String name;
	private int age;

	public Item(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Name : "+name+" Age : "+age;
	}
}
