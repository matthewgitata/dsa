package com.matthewgitata.dsa.arrays.tempproject;

import java.util.Scanner;

/**
 * created by @matthewgitata on 02/01/2023
 */

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberOfDays = getNumberOfDays(console);
        DaysTemperatureRecord day1Recordings = new DaysTemperatureRecord(numberOfDays);
        int[] temps = getTemperatures(console, numberOfDays);
        day1Recordings.findNumberOfDaysAboveAverageTemperature(temps);
    }

    private static int getNumberOfDays(Scanner console) {
        System.out.print("How many day's temperature? ");
        return console.nextInt();
    }

    private static int[] getTemperatures(Scanner console, int numberOfDays) {
        int[] temps = new int[numberOfDays];
        for (int index = 0; index < numberOfDays; index++) {
            System.out.print("Day " + (index + 1) + "'s high temp: ");
            temps[index] = console.nextInt();
        }
        return temps;
    }
}