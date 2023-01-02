package com.matthewgitata.dsa.arrays.tempproject;

/**
 * created by @matthewgitata on 02/01/2023
 */

public class DaysTemperatureRecord {

    public DaysTemperatureRecord(int numberOfDays) {
        int[] temperatures = new int[numberOfDays];
    }

    public void findNumberOfDaysAboveAverageTemperature(int[] temperatures) {
        double average = getAverageTemperature(temperatures);
        int daysAboveAverageTemperature = 0;
        for (int temperature : temperatures) {
            if (temperature > average) {
                daysAboveAverageTemperature = daysAboveAverageTemperature + 1;
            }
        }
        System.out.println(daysAboveAverageTemperature + " day(s) above average");
    }

    private double getAverageTemperature(int[] temperatures) {
        double totalTemperature = 0;
        for (int temperature : temperatures) {
            totalTemperature = totalTemperature + temperature;
        }
        double average = totalTemperature / temperatures.length;
        System.out.println("Average = " + average);
        return average;
    }
}