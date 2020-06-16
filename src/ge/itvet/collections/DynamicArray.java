package ge.itvet.collections;

import ge.itvet.equalsmethod.Foo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class DynamicArray<E> implements Iterable<E> {
    private Object arr[];


    public DynamicArray() {
        arr = new Object[0];
    }

    public void add(E o) {
        Object tempArr[] = new Object[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }
        tempArr[arr.length] = o;
        arr = tempArr;
    }

    public E get(int index) {
        return (E) arr[index];
    }

    public int size() {
        return arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    @Override
    public Iterator<E> iterator() {
        return new DynamicArrayIterator<E>((E[]) arr);
    }

    public static class DynamicArrayIterator<E> implements Iterator<E> {
        private final E[] arr;
        private int iteration;

        public DynamicArrayIterator(E[] arr) {
            this.arr = arr;
            this.iteration = 0;
        }

        @Override
        public E next() {
            return arr[iteration++];
        }

        @Override
        public boolean hasNext() {
            return iteration < arr.length;
        }
    }
}


