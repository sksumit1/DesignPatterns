package prototype_design_pattern;

import prototype_design_pattern.impl.Employee;

public class MainClass {
	
	public static void main(String[] args) {
		IPerson hrDepartmentObj = new Employee();
		IPerson financeDepartmentObj = hrDepartmentObj.clonePrototype();
		System.out.println("HR dept. :: "+hrDepartmentObj.getName());
		System.out.println("Finance dept. :: "+financeDepartmentObj.getName());
	}

}
