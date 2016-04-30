package strategy_design_pattern;

import strategy_design_pattern.impl.ColdStrategy;
import strategy_design_pattern.impl.HikeStrategy;

public class MainClass {
	public static void main(String[] args) {

		int temperatureInF = 60;

		Strategy coldStrategy = new ColdStrategy();
		Context context = new Context(temperatureInF, coldStrategy);

		System.out.println("Is the required temperature (" + context.getTemperatureInF() + "F) . Keep in refrigerator? " + context.getResult());

		Strategy hikeStrategy = new HikeStrategy();
		context.setStrategy(hikeStrategy);

		System.out.println("Is the required temperature (" + context.getTemperatureInF() + "F) . Microwave? " + context.getResult());

	}
}