package com.matthewgitata.dsa.quiz.queue.animalshelter;

import java.util.LinkedList;

/**
 * The {@code AnimalQueue} class defines a Queue based on LinkedList
 * for {@code Animal}s: {@code Dog}s and {@code Cat}s.
 */
public class AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0;

    /**
     * Push Animal to Queue.
     *
     * @param a animal being added
     */
    public void enQueue(Animal a) {
        a.setOrder(0);
        order++;
        if (a instanceof Dog) {
            dogs.addLast((Dog) a);
        } else if (a instanceof Cat) {
            cats.addLast((Cat) a);
        }
    }

    /**
     * Identifies size of the Queue.
     *
     * @return size of the queue.
     */
    public int size() {
        return dogs.size() + cats.size();
    }

    /**
     * DeQueue dogs.
     *
     * @return removed dog.
     */
    public Dog deQueueDogs() {
        return dogs.poll();
    }

    /**
     * Peeks dogs.
     *
     * @return first dog in queue.
     */
    public Dog peekDog() {
        return dogs.peek();
    }

    /**
     * DeQueue cats.
     *
     * @return removed cats.
     */
    public Cat deQueueCats() {
        return cats.poll();
    }

    /**
     * Peeks cats.
     *
     * @return first cat in queue.
     */
    public Cat peekCat() {
        return cats.peek();
    }

    /**
     * DeQueue any animal
     *
     * @return any animal
     */
    public Animal deQueueAny() {
        if (dogs.size() == 0) {
            deQueueCats();
        } else if (cats.size() == 0) {
            deQueueDogs();
        }
        Dog dog = dogs.peek();
        Cat cat = cats.peek();
        if (dog.isOlderThan(cat)) {
            return dogs.poll();
        } else {
            return cats.poll();
        }
    }

    /**
     * Peek first animal in shelter.
     *
     * @return first Animal.
     */
    public Animal peek() {
        if (dogs.size() == 0) {
            cats.peek();
        } else if (cats.size() == 0) {
            dogs.peek();
        }
        Dog dog = dogs.peek();
        Cat cat = cats.peek();
        if (dog.isOlderThan(cat)) {
            return dogs.peek();
        } else {
            return cats.peek();
        }
    }

}