package app.vehicles;
import app.Config;

public abstract class Vehicle {
	private String make;
	private String model;
	private String frameId;
	private String licencePlate;
	private int year;
	private int displacement;
	private int fuelTankCapacity;
	private double fuelConsumption;

	public Vehicle(String make, String model, String licencePlate, String frameId, int year, int displacement, int fuelTankCapacity, double fuelConsumption) {
		this.setMake(make);
		this.setModel(model);
		this.setLicencePlate(licencePlate);
		this.setFrameId(frameId);
		this.setYear(year);
		this.setDisplacement(displacement);
		this.setFuelTankCapacity(fuelTankCapacity);
		this.setFuelConsumption(fuelConsumption);
	}

	public void setMake(String make) {
		if (make == null) {
			throw new IllegalArgumentException("Make cannot be null");
		}

		this.make = make;
	}

	public String getMake() {
		return this.make;
	}

	public void setModel(String model) {
		if (model == null) {
			throw new IllegalArgumentException("Model cannot be null");
		}

		this.model = model;
	}

	public String getModel() {
		return this.model;
	}

	public void setFrameId(String frameId) {
		if (frameId == null) {
			throw new IllegalArgumentException("Frame id cannot be null");
		}
		if (frameId.length() != Config.FRAME_ID_LENGTH) {
			throw new IllegalArgumentException("Frame id must be 17 characters long");
		}

		this.frameId = frameId;
	}

	public String getFrameId() {
		return this.frameId;
	}

	public void setLicencePlate(String licencePlate) {
		if (licencePlate == null) {
			throw new IllegalArgumentException("Licence plate cannot be null");
		}
		if (licencePlate.length() != Config.LICENCE_PLATE_LENGTH) {
			throw new IllegalArgumentException("Licence plate must be 7 characters long");
		}

		this.licencePlate = licencePlate;
	}

	public String getLicencePlate() {
		return this.licencePlate;
	}

	public void setYear(int year) {
		if (year < Config.MIN_YEAR || year > Config.MAX_YEAR) {
			throw new IllegalArgumentException("Year of production must be between 1900 and 2021");
		}

		this.year = year;
	}

	public int getYear() {
		return this.year;
	}

	public void setDisplacement(int displacement) {
		if (displacement <= 0) {
			throw new IllegalArgumentException("Engine capacity must be greater than 0");
		}

		this.displacement = displacement;
	}

	public int getDisplacement() {
		return this.displacement;
	}

	public void setFuelTankCapacity(int fuelTankCapacity) {
		if (fuelTankCapacity <= 0) {
			throw new IllegalArgumentException("Fuel tank capacity must be greater than 0");
		}

		this.fuelTankCapacity = fuelTankCapacity;
	}

	public int getFuelTankCapacity() {
		return this.fuelTankCapacity;
	}

	public void setFuelConsumption(double fuelConsumption) {
		if (fuelConsumption <= 0) {
			throw new IllegalArgumentException("Fuel consumption must be greater than 0");
		}

		this.fuelConsumption = fuelConsumption;
	}

	public double getFuelConsumption() {
		return this.fuelConsumption;
	}

	@Override
	public String toString() {
		return String.format(
			"""
			%s %s %d:
				* Frame id: %s
				* Licence plate: %s
				* Engine capacity: %d cm^3
				* Fuel tank capacity: %d l
				* Fuel consumption: %.3f l/km
			""",
			this.getMake(), this.getModel(), this.getYear(),
			this.getFrameId(),
			this.getLicencePlate(),
			this.getDisplacement(),
			this.getFuelTankCapacity(),
			this.getFuelConsumption()
		);
	}
}
