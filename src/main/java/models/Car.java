package models;

public class Car {

	private String color;
	private String registrationNumber;

	public Car(String color, String registrationNumber) {
		this.color = color;
		this.registrationNumber = registrationNumber;
	}

	public String getColor() {
		return color;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

}
