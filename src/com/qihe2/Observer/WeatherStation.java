package com.qihe2.Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasuresments(80,65,40.4f);
        weatherData.setMeasuresments(82,62,40.4f);
        weatherData.setMeasuresments(78,90,2.4f);
    }
}
