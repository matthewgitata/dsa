package com.matthewgitata.dsa.quiz.queue.animalshelter;

/**
 * The {@code Main} class has method where all
 * {@code com.matthewgitata.dsa.quiz.queue.animalshelter.Animal} operations are performed.
 * <p>
 * created by @matthewgitata on 31/01/2023.
 */
public class Main {
    public static void main(String[] args) {
        AnimalQueue animals = new AnimalQueue();
        animals.enQueue(new Cat("Kiki"));
        animals.enQueue(new Cat("Curry"));
        animals.enQueue(new Dog("Beji"));
        animals.enQueue(new Cat("Reki"));
        animals.enQueue(new Dog("Dexter"));

        System.out.println(animals.deQueueAny().name);
        System.out.println(animals.deQueueDogs().name);
        System.out.println(animals.deQueueCats().name);
    }
}