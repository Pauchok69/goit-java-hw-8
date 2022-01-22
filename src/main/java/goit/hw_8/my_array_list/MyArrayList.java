package goit.hw_8.my_array_list;

import java.util.StringJoiner;

public class MyArrayList<T> {
    private static final int INIT_SIZE = 8;

    private Object[] array;
    private int index = 0;

    public MyArrayList() {
        array = new Object[INIT_SIZE];
    }

    public boolean add(T value) {
        resizeArrayIfNeed();

        array[index] = value;
        index++;

        return true;
    }

    private void resizeArrayIfNeed() {
        if (index == array.length) {
            int newSize = index * 2;
            Object[] newArray = new Object[newSize];
            System.arraycopy(array, 0, newArray, 0, index);
            array = newArray;
        }
    }

    public T get(int index) {
        return (T) array[index];
    }

    public int size() {
        return index;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");

        for (int i = 0; i < index; i++) {
            result.add(array[i].toString());
        }

        return "[" + result + "]";
    }
}
