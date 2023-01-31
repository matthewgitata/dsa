package com.matthewgitata.dsa.queues.quiz.queueviastack;

/**
 * The {@code Main} class contains method where all
 * QueueVsStack operations are performed.
 * <p>
 * created by @matthewgitata on 31/01/2023.
 */
public class Main {
    public static void main(String[] args) {
        QueueViaStack newQueue = new QueueViaStack();
        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        newQueue.enQueue(4);
        System.out.println(newQueue.peek());
    }
}