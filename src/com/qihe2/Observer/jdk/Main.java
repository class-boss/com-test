package com.qihe2.Observer.jdk;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay curr = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasuresments(10,21,12);
        weatherData.setMeasuresments(11,21,12);
        weatherData.setMeasuresments(12,21,12);
    }
}
