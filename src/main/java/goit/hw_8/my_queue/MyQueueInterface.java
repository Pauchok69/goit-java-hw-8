package goit.hw_8.my_queue;

public interface MyQueueInterface<T> {

    void add(T value);

    T remove(int index);

    void clear();

    int size();

    T peek();

    T poll();
}
