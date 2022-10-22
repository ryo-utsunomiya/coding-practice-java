package crackingthecodinginterview.linkedlist.animalshelter;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    private final Queue<Dog> dogQueue = new LinkedList<>();
    private final Queue<Cat> catQueue = new LinkedList<>();
    private int order = 0;

    public void enqueue(Animal animal) {
        animal.order = this.order++;

        if (animal instanceof Dog) {
            dogQueue.add((Dog) animal);
        } else if (animal instanceof Cat) {
            catQueue.add((Cat) animal);
        }
    }

    public Animal dequeueAny() {
        if (dogQueue.isEmpty() && catQueue.isEmpty()) {
            throw new RuntimeException("queue is empty");
        } else if (dogQueue.isEmpty()) {
            return catQueue.poll();
        } else if (catQueue.isEmpty()) {
            return dogQueue.poll();
        }

        if (dogQueue.peek().isOlderThan(catQueue.peek()))  {
            return dogQueue.poll();
        } else {
            return catQueue.poll();
        }
    }

    public Dog dequeueDog() {
        return dogQueue.poll();
    }

    public Cat dequeueCat() {
        return catQueue.poll();
    }

    abstract static class Animal {
        String name;
        int order;

        public boolean isOlderThan(Animal another) {
            return this.order < another.order;
        }
    }
    static class Dog extends Animal { }
    static class Cat extends Animal { }
}
