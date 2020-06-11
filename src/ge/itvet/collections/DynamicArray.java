package ge.itvet.collections;

import java.util.Arrays;

public class DynamicArray<E, B> {
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

    public void method(E e) {
    }

    public B method1(E e, B b) {
        return b;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}


