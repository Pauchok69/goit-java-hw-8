package goit.hw_8.my_linked_list;

import java.util.LinkedList;

public class MyLinkedListTests {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());

        for (int i = 0; i <= 99; i++) {
            myLinkedList.add("Element-" + i);
        }

        System.out.println("myLinkedList.size() = " + myLinkedList.size());

        System.out.println("myLinkedList.get(0) = " + myLinkedList.get(0));
        System.out.println("myLinkedList.get(1) = " + myLinkedList.get(1));
        System.out.println("myLinkedList.get(49) = " + myLinkedList.get(49));
        System.out.println("myLinkedList.get(50) = " + myLinkedList.get(50));
        System.out.println("myLinkedList.get(51) = " + myLinkedList.get(51));
        System.out.println("myLinkedList.get(55) = " + myLinkedList.get(55));
        System.out.println("myLinkedList.get(99) = " + myLinkedList.get(99));

        System.out.println("myLinkedList.get(33) = " + myLinkedList.get(33));
        System.out.println("myLinkedList.remove(33) = " + myLinkedList.remove(33));
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        System.out.println("myLinkedList.get(33) = " + myLinkedList.get(33));

        System.out.println("myLinkedList.get(0) = " + myLinkedList.get(0));
        System.out.println("myLinkedList.remove(0) = " + myLinkedList.remove(0));
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        System.out.println("myLinkedList.get(0) = " + myLinkedList.get(0));

        System.out.println("myLinkedList.get(97) = " + myLinkedList.get(97));
        System.out.println("myLinkedList.remove(97) = " + myLinkedList.remove(97));
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        System.out.println("myLinkedList.get(96) = " + myLinkedList.get(96));

        System.out.println("Clear");
        myLinkedList.clear();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
    }
}
