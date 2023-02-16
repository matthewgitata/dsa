package com.matthewgitata.dsa.greedyalgorithms.activityselection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * The {@code ActivitySelection} class implements
 * the Activity Selection Problem
 * <p>
 * created by @matthewgitata on 16/02/2023.
 */
public class ActivitySelection {
    static void activitySelection(ArrayList<Activity> activitiesList) {
        Comparator<Activity> finishTimeComparator = new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return o1.getFinishTime() - o2.getFinishTime();
            }
        };
        Collections.sort(activitiesList, finishTimeComparator);
        Activity previousActivity = activitiesList.get(0);
        System.out.println("\n\nRecommended Schedule:\n" + previousActivity);
        for (int i = 1; i < activitiesList.size(); i++) {
            Activity activity = activitiesList.get(i);
            if (activity.getStartTime() >= previousActivity.getFinishTime()) {
                System.out.println(activity);
                previousActivity = activity;
            }
        }
    }
}