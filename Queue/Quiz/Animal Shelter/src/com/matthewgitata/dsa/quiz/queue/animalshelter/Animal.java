package com.matthewgitata.dsa.quiz.queue.animalshelter;

/**
 * The {@code Animal} class describes Animal objects.
 * <p>
 * created by @matthewgitata on 31/01/2023.
 */
public abstract class Animal {
    private int order;
    protected String name;

    public Animal(String n) {
        this.name = n;
    }

    public abstract String name();

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    /**
     * Checks if current Animal is older than one being provided.
     * @param animal the animal being provided.
     * @return true if current animal is older, else otherwise.
     */
    public boolean isOlderThan(Animal animal) {
        return this.order < animal.getOrder();
    }
}