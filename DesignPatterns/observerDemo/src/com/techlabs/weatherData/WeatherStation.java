package com.techlabs.weatherData;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.4f);
		weatherData.setMeasurements(78, 90, 27.4f);
		
	}
}
