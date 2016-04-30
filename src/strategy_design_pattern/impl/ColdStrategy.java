package strategy_design_pattern.impl;

import strategy_design_pattern.Strategy;

public class ColdStrategy implements Strategy {
	@Override
	public boolean checkTemperature(int temperatureInF) {
		if (temperatureInF <= 32) {
			return true;
		} else {
			return false;
		}
	}
}
