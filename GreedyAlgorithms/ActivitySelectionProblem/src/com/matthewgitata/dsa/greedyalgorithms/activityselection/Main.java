package com.matthewgitata.dsa.greedyalgorithms.activityselection;

import java.util.ArrayList;

/**
 * The {@code Main} class defines a method where
 * ActivitySelection operations are performed.
 * <p>
 * created by @matthewgitata on 16/02/2023.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Activity> activitiesList = new ArrayList<>();
        activitiesList.add(new Activity("A1", 0, 6));
        activitiesList.add(new Activity("A2", 3, 4));
        activitiesList.add(new Activity("A3", 1, 2));
        activitiesList.add(new Activity("A4", 5, 8));
        activitiesList.add(new Activity("A5", 5, 7));
        activitiesList.add(new Activity("A6", 8, 9));

        ActivitySelection.activitySelection(activitiesList);
    }
}