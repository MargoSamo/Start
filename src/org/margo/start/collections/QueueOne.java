package org.margo.start.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueOne {
    public static void main(String[] args) {
        Men men1 = new Men(1);
        Men men2 = new Men(2);
        Men men3 = new Men(3);
        Men men4 = new Men(4);

        Queue<Men> people = new LinkedList<>();
        people.add(men3);
        people.add(men2);
        people.add(men4);
        people.add(men1);

        for(Men men:people)
            System.out.println(men);

        Queue<Men> forMen = new ArrayBlockingQueue<>(10);
        forMen.add(men2);
        forMen.add(men1);
        forMen.add(men4);
        forMen.add(men3);

        System.out.println();
        System.out.println(forMen.remove());
        System.out.println(forMen.peek());
        System.out.println(forMen);

        Queue<Men> nextMen = new ArrayBlockingQueue<>(3);
        nextMen.add(men1);
        nextMen.add(men2);
        nextMen.add(men3);
        nextMen.add(men4);

        System.out.println();
        System.out.println(nextMen);
    }
}

class Men {
    private int id;

    public Men(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Men{" +
                "id=" + id +
                '}';
    }
}
