package com.matthewgitata.dsa.quiz.queue.animalshelter;

/**
 * The {@code Dog} class defines a Dog object and its
 * accompanying behaviors.
 * <p>
 * created by @matthewgitata on 31/01/2023.
 */
public class Dog extends Animal {
    public Dog(String n) {
        super(n);
    }

    @Override
    public String name() {
        return "Dog " + name;
    }
}