package abstract_factory_design_pattern;

import abstract_factory_design_pattern.impl.BMW_Factory;
import abstract_factory_design_pattern.impl.Ford_Factory;

public class AbstractFactory {
	
	private static final AbstractFactory instance = new AbstractFactory();
	
	private AbstractFactory() {
		super();
	}

	public static AbstractFactory getInstance() {
		return instance;
	}
	
	public I_Factory getFactory(String brand) {
		if(brand.equals("ford")) {
			return Ford_Factory.getInstance();
		} else {
			return BMW_Factory.getInstance();
		}
	}

}
