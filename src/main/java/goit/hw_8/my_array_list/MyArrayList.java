package goit.hw_8.my_array_list;

import java.util.StringJoiner;

public class MyArrayList<T> implements MyArrayListInterface<T> {
    private static final int INIT_SIZE = 8;

    private Object[] array;
    private int index = 0;

    public MyArrayList() {
        createEmptyArray();
    }

    private void createEmptyArray() {
        array = new Object[INIT_SIZE];
    }

    public void add(T value) {
        if (value == null) {
            return;
        }
        resizeArrayIfNeed();

        array[index] = value;
        index++;
    }

    private void resizeArrayIfNeed() {
        if (index == array.length) {
            int newSize = index * 2;
            Object[] newArray = new Object[newSize];
            System.arraycopy(array, 0, newArray, 0, index);
            array = newArray;
        }
    }

    @SuppressWarnings("unchecked") // add this annotation to fix warning "Unchecked cast"
    public T get(int index) {
        checkForIndexExistence(index);

        return (T) array[index];
    }

    private void checkForIndexExistence(int index) throws IndexOutOfBoundsException {
        if (array[index] == null) {
            throw new IndexOutOfBoundsException(
                    "There is no value with index " + index + " in the arrayList"
            );
        }
    }

    public T remove(int index) {
        checkForIndexExistence(index);

        T removedValue = (T) array[index];

        System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        --this.index;

        return removedValue;
    }

    public int size() {
        return index;
    }

    public void clear() {
        if (index == 0) {
            return;
        }

        createEmptyArray();
        index = 0;
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
