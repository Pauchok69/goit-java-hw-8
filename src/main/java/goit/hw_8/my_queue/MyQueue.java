package goit.hw_8.my_queue;

public interface MyQueue<T> {

    void add(T value);

    T remove(int index);

    void clear();

    int size();

    T peek();

    T poll();
}
