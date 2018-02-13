package com.vaadin.starter.skeleton;

import java.util.Arrays;
import java.util.List;

public class ChartsData {

    public static class WeatherInfo {
        private String month;
        private double temperature;

        WeatherInfo(String month, double temperature) {
            this.month = month;
            this.temperature = temperature;
        }

        public String getMonth() {
            return month;
        }

        public double getTemperature() {
            return temperature;
        }
    }

    private List<WeatherInfo> tokyoData;
    private List<WeatherInfo> londonData;

    public ChartsData() {
        tokyoData = Arrays.asList(new WeatherInfo("Jan", 7.0),
                new WeatherInfo("Feb", 6.9), new WeatherInfo("Mar", 9.5),
                new WeatherInfo("Apr", 14.5), new WeatherInfo("May", 18.2),
                new WeatherInfo("Jun", 21.5), new WeatherInfo("Jul", 25.2),
                new WeatherInfo("Aug", 26.5), new WeatherInfo("Sep", 23.3),
                new WeatherInfo("Oct", 18.3), new WeatherInfo("Nov", 13.9),
                new WeatherInfo("Dec", 9.6));
        londonData = Arrays.asList(new WeatherInfo("Jan", 3.9),
                new WeatherInfo("Feb", 4.2), new WeatherInfo("Mar", 5.7),
                new WeatherInfo("Apr", 8.5), new WeatherInfo("May", 11.9),
                new WeatherInfo("Jun", 15.2), new WeatherInfo("Jul", 17.0),
                new WeatherInfo("Aug", 16.6), new WeatherInfo("Sep", 14.2),
                new WeatherInfo("Oct", 10.3), new WeatherInfo("Nov", 6.6),
                new WeatherInfo("Dec", 4.8));
    }

    /**
     * @return Weather size data for Tokyo
     */
    public List<WeatherInfo> getTokyoData() {
        return tokyoData;
    }

    /**
     * @return Weather data for London
     */
    public List<WeatherInfo> getLondonData() {
        return londonData;
    }

}