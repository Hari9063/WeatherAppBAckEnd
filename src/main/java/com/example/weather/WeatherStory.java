package com.example.weather;

import com.example.weather.WeatherResponse.Weather;

public class WeatherStory {

    public static String getStory(WeatherResponse resp) {

        String city = resp.getName();
        double speed = resp.getWind().getSpeed();
        double temp = resp.getMain().getTemp();
        String cond = resp.getWeather().get(0).getDescription();

        StringBuilder b = new StringBuilder("🌍 In the city of " + city + ", ");

        // Condition-based poetic lines
        if (cond.contains("rain")) {
            b.append("the heavens are shedding silver tears, painting the streets with a shimmering glow. ");
        } else if (cond.contains("clear")) {
            b.append("the golden sun grins widely, blessing the land with warmth and clarity. ");
        } else if (cond.contains("cloud")) {
            b.append("velvety clouds wander like sleepy giants, casting playful shadows below. ");
        } else if (cond.contains("storm")) {
            b.append("the sky growls with a dramatic storm, nature’s orchestra in full force. ");
        } else {
            b.append("the weather wears a mysterious cloak, revealing its mood in subtle whispers. ");
        }

        // Temperature narration
        b.append("🌡️ The temperature hovers around ").append(temp).append("°C, ");
        if (temp > 35) {
            b.append("scorching the day with fiery heat, making the air dance like mirages. ");
        } else if (temp > 25) {
            b.append("wrapping the city in a cozy warmth, perfect for an evening stroll. ");
        } else if (temp < 10) {
            b.append("sending icy chills through the air, where breath turns to misty clouds. ");
        } else if (temp < 18) {
            b.append("sprinkling the air with a crisp, refreshing coolness. ");
        } else {
            b.append("balancing perfectly between comfort and charm. ");
        }

        // Wind description
        b.append("💨 The wind whispers at ").append(speed).append(" km/h, ");
        if (speed > 20) {
            b.append("roaring with wild energy, bending trees and stirring restless spirits. ");
        } else if (speed > 10) {
            b.append("dancing gently through the streets, carrying the scent of earth and rain. ");
        } else {
            b.append("moving softly, like a quiet lullaby caressing the skin. ");
        }

        // Final closing line
        b.append("✨ Today, ").append(city)
         .append(" feels like a living painting—each element of nature telling its own story.");

        return b.toString();
    }
}
