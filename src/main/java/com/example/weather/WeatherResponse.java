package com.example.weather;

import java.util.List;

public class WeatherResponse {

	private Main main;
	private List<Weather> weather;
	private Wind wind;
	private String name;
	
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static class Main{
		private double Temp;
		public double getTemp() {
			return Temp;
		}
		public void setTemp(double temp) {
			Temp = temp;
		}
	}
	public static class Weather{
		private String description;

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
		
	}
	public static class Wind{
		private double speed;

		public double getSpeed() {
			return speed;
		}

		public void setSpeed(double speed) {
			this.speed = speed;
		}
		
	}
	
	
	
	
	
}
