package goit.hw_8.my_array_list;

public interface MyArrayListInterface<T> {
    void add(T value);

    public void clear();

    public T get(int index);

    public T remove(int index);

    public int size();
}
