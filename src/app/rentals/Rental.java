package app.rentals;
import app.vehicles.*;

public class Rental {
	private Vehicle vehicle;
	private double kilometers;
	private double freeKilometers;
	private double pricePerDay;
	private double pricePerKilometer;
	private double pricePerLiter;

	public Rental(Vehicle vehicle, double kilometers, double freeKilometers, double pricePerDay, double pricePerKilometer, double pricePerLiter) {
		this.setVehicle(vehicle);
		this.setKilometers(kilometers);
		this.setFreeKilometers(freeKilometers);
		this.setPricePerDay(pricePerDay);
		this.setPricePerKilometer(pricePerKilometer);
		this.setPricePerLiter(pricePerLiter);
	}

	private void setVehicle(Vehicle vehicle) {
		if (vehicle == null) {
			throw new IllegalArgumentException("Vehicle cannot be null");
		}

		this.vehicle = vehicle;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setKilometers(double kilometers) {
		if (kilometers < 0) {
			throw new IllegalArgumentException("Kilometers must not be negative");
		}

		this.kilometers = kilometers;
	}

	public double getKilometers() {
		return this.kilometers;
	}

	public void setFreeKilometers(double freeKilometers) {
		if (freeKilometers < 0) {
			throw new IllegalArgumentException("Free kilometers must not be negative");
		}

		this.freeKilometers = freeKilometers;
	}

	public double getFreeKilometers() {
		return this.freeKilometers;
	}

	public void setPricePerDay(double pricePerDay) {
		if (pricePerDay < 0) {
			throw new IllegalArgumentException("Price per day must not be negative");
		}

		this.pricePerDay = pricePerDay;
	}

	public double getPricePerDay() {
		return this.pricePerDay;
	}

	public void setPricePerKilometer(double pricePerKilometer) {
		if (pricePerKilometer < 0) {
			throw new IllegalArgumentException("Price per kilometer must not be negative");
		}

		this.pricePerKilometer = pricePerKilometer;
	}

	public double getPricePerKilometer() {
		return this.pricePerKilometer;
	}

	public void setPricePerLiter(double pricePerLiter) {
		if (pricePerLiter < 0) {
			throw new IllegalArgumentException("Price per liter must not be negative");
		}

		this.pricePerLiter = pricePerLiter;
	}

	public double getPricePerLiter() {
		return this.pricePerLiter;
	}

	@Override
	public String toString() {
		return String.format(
			"""
			Vehicle: %s
			+ Kilometers: %.3f km
			+ Free kilometers: %.3f km
			+ Price per day: %.2f €
			+ Price per kilometer: %.2f €
			+ Price per liter: %.2f €
			""",
			this.vehicle.toString(),
			this.kilometers,
			this.freeKilometers,
			this.pricePerDay,
			this.pricePerKilometer,
			this.pricePerLiter
		);
	}
}
