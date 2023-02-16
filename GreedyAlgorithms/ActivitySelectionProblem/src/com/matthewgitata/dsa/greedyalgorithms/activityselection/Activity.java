package com.matthewgitata.dsa.greedyalgorithms.activityselection;

/**
 * The {@code Activity} class define the properties of
 * an Activity object and their getter and setters.
 * <p>
 * created by @matthewgitata on 16/02/2023.
 */
public class Activity {
    private String name;
    private int startTime;
    private int finishTime;

    /**
     * Constructor.
     *
     * @param name       the name.
     * @param startTime  the start time.
     * @param finishTime the finish time.
     */
    public Activity(String name, int startTime, int finishTime) {
        this.name = name;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public String toString() {
        return "Activity: " + name + ", startTime=" + startTime + ", finishTime=" + finishTime;
    }
}