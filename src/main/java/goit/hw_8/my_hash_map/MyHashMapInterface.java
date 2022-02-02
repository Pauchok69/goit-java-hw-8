package goit.hw_8.my_hash_map;

public interface MyHashMapInterface<K, V> {

    void put(K key, V value);

    void remove(K key);

    void clear();

    int size();

    V get(K key);
}
