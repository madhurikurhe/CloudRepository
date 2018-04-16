package com.techlabs.weatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	Observable observable;
	private float temperature;                       
	private float humidity;
	
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData){
			WeatherData weatherData=(WeatherData)obs;
			this.temperature=weatherData.getTemperature();
			this.humidity=weatherData.getHumidity();
			display();
		}
	}

	private void display() {
		System.out.println("Current conditions:"+temperature + "F degrees and " + humidity + "  Humidity");
	}
	
}
