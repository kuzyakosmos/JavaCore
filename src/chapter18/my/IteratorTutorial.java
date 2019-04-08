package chapter18.my;

import java.util.Iterator;

public class IteratorTutorial {
}

class SimpleIterator<T> implements Iterator {

    private T[] objects;
    private int index = 0;

    public SimpleIterator(T[] objects) {
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return index < objects.length;
    }

    @Override
    public Object next() {
        return objects[index++];
    }

    public static void main(String[] args) {

        Integer[] integers = new Integer[] {1, 2, 3};
        SimpleIterator s = new SimpleIterator(integers);

        while (s.hasNext()) {
            Integer i = (Integer) s.next();
            System.out.println(i);
        }
    }
}