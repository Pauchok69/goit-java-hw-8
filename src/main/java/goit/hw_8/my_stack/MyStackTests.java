package goit.hw_8.my_stack;

public class MyStackTests {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        System.out.println("myStack.size() = " + myStack.size());
//        System.out.println("myStack.peek() = " + myStack.peek());
//        System.out.println("myStack.pop() = " + myStack.pop());

        for (int i = 0; i < 100; i++) {
            myStack.push("Value " + i);
        }
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println("myStack.peek() = " + myStack.peek());

        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.size() = " + myStack.size());

        System.out.println("myStack.remove(0) = " + myStack.remove(0));
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.remove(5) = " + myStack.remove(5));
        System.out.println("myStack.size() = " + myStack.size());


        System.out.println("Clear");
        myStack.clear();
        System.out.println("myStack.size() = " + myStack.size());
    }
}
