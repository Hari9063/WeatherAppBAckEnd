package com.example.weather;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
	private final String Api_Key="f689918e7b9bd4106dba06888e3dd898";
	private final String URL="https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";

	public WeatherResponse getweather(String city) {
		
		String url=String.format(URL,city,Api_Key);
		RestTemplate rest=new RestTemplate();
		
		// TODO Auto-generated method stub
		return rest.getForObject(url, WeatherResponse.class);
	}
	
	

}
