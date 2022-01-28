package goit.hw_8.my_linked_list;

public class MyLinkedList<T> implements MyLinkedListInterface<T> {
    private int size = 0;

    private Node<T> head;
    private Node<T> last;

    @Override
    public void add(T value) {
        if (head == null) {
            head = new Node<>(value, null, null);
            last = head;
        } else {
            Node<T> newNode = new Node<>(value, last, null);
            last.next = newNode;
            last = newNode;
        }

        size++;
    }

    @Override
    public T get(int index) {
        Node<T> result = findNodeByIndex(index);

        return result.value;
    }

    private Node<T> findNodeByIndex(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<T> result;

        if (index > size / 2) {
            result = last;

            for (int i = 0; i < size - index - 1; i++) {
                result = result.prev;
            }
        } else {
            result = head;

            for (int i = 0; i < index; i++) {
                result = result.next;
            }
        }
        return result;
    }

    @Override
    public T remove(int index) {
        Node<T> nodeToRemove = findNodeByIndex(index);

        T nodeToRemoveValue = nodeToRemove.value;

        if (size == 1) {
            clear();

            return nodeToRemoveValue;
        }
        Node<T> prevNodeOfRemoved = nodeToRemove.prev;
        Node<T> nextNodeOfRemoved = nodeToRemove.next;

        if (prevNodeOfRemoved == null) {
            nextNodeOfRemoved.prev = null;
            head = nextNodeOfRemoved;
        } else if (nextNodeOfRemoved == null) {
            prevNodeOfRemoved.next = null;
            last = prevNodeOfRemoved;
        } else {
            prevNodeOfRemoved.next = nextNodeOfRemoved;
            nextNodeOfRemoved.prev = prevNodeOfRemoved;
        }
        size--;
        nodeToRemove.next = nodeToRemove.prev = null;

        return nodeToRemoveValue;
    }

    @Override
    public void clear() {
        Node<T> node = head;

        while (node != null) {
            Node<T> next = node.next;
            node.prev = node.next = null;

            node = next;
        }

        head = last = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private static class Node<T> {
        Node<T> next;
        Node<T> prev;
        private final T value;

        public Node(T value, Node<T> prev, Node<T> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
