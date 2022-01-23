package goit.hw_8;

public interface MyArrayListInterface<T> {
    void add(T value);

    public void clear();

    public T get(int index);

    public T remove(int index);

    public int size();
}
