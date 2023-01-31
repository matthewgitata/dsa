package com.matthewgitata.dsa.quiz.queue.animalshelter;

/**
 * The {@code Cat} class defines a Cat object and its
 * accompanying behaviors.
 * <p>
 * created by @matthewgitata on 31/01/2023.
 */
public class Cat extends Animal {
    public Cat(String n) {
        super(n);
    }

    @Override
    public String name() {
        return "Cat " + name;
    }
}