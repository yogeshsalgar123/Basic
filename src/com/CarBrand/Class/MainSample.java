package com.CarBrand.Class;

public class MainSample {

	public static void main(String[] args) {

		Brand b1 = new Brand("ford", "old version");

		Car c1 = new Car(b1);

		c1.getBrand();
	}
}
