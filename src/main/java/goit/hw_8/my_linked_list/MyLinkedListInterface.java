package goit.hw_8.my_linked_list;

public interface MyLinkedListInterface<T> {
    void add(T value);

    T get(int index);

    T remove(int index);

    void clear();

    int size();
}
