package goit.hw_8.my_queue;

public class MyQueueTests {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        System.out.println("myQueue.size() = " + myQueue.size());

        for (int i = 0; i < 10; i++) {
            myQueue.add("Element " + i);
        }
        System.out.println("myQueue.size() = " + myQueue.size());
        System.out.println("myQueue.peek() = " + myQueue.peek());

        System.out.println("myQueue.remove(0) = " + myQueue.remove(0));
        System.out.println("myQueue.size() = " + myQueue.size());
        System.out.println("myQueue.peek() = " + myQueue.peek());

        System.out.println("myQueue.remove(0) = " + myQueue.remove(0));
        System.out.println("myQueue.size() = " + myQueue.size());
        System.out.println("myQueue.peek() = " + myQueue.peek());

        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.poll() = " + myQueue.poll());

        System.out.println("Clear");
        myQueue.clear();
        System.out.println("myQueue.size() = " + myQueue.size());

        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue.size() = " + myQueue.size());
    }
}
