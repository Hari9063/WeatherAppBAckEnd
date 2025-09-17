package com.example.weather;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/weather")
@CrossOrigin(origins ="http://localhost:3000")
public class WeatherController {
	
	
	private WeatherService service;
	
	WeatherController(WeatherService service){
		this.service=service;
	}
	
	@RequestMapping("/{city}")
	String getWeatherToday(@PathVariable String city){
		
		WeatherResponse response =service.getweather(city);
		
		return WeatherStory.getStory(response);
		
		
	}
	
	
	
	
	

}
