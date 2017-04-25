package ubu.gii.dass.refactoring;

public class TypeMovie {

	private int baseDays;
	private double basePrice;
	private double pricePerDay;
	private int daysToGetPoints;
	private int incrementPoints;

	public TypeMovie(int baseDays, double basePrice, double pricePerDay, int daysToGetPoints, int incrementPoints) {
		this.baseDays = baseDays;
		this.basePrice = basePrice;
		this.pricePerDay = pricePerDay;
		this.daysToGetPoints = daysToGetPoints;
		this.incrementPoints = incrementPoints;
	}

	public int numBaseDays() {
		return baseDays;
	}

	public double basePrice() {
		return basePrice;
	}

	public double pricePerDay() {
		return pricePerDay;
	}

	public double priceFor(int days) {
		double rest = 0;
		if (days > baseDays) {
			rest = (days - baseDays) * pricePerDay;
		}
		return basePrice + rest;
	}

	public int incrementOfPoints(int days) {
		if (days > daysToGetPoints) {
			return 1+incrementPoints;
		} else {
			return 1;
		}
	}
}
