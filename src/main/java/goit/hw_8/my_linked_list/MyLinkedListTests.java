package goit.hw_8.my_linked_list;

public class MyLinkedListTests {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        for (int i = 0; i < 9; i++) {
            myLinkedList.add("String" + i);
        }

        System.out.println("myLinkedList = " + myLinkedList);
//        System.out.println("myLinkedList.size() = " + myLinkedList.size());
//        System.out.println("myLinkedList.get(3) = " + myLinkedList.get(3));
//        System.out.println("myLinkedList.remove(4) = " + myLinkedList.remove(4));
//        System.out.println("myLinkedList = " + myLinkedList);
//
//        myLinkedList.add(null);
//
//        System.out.println("myLinkedList = " + myLinkedList);
//        System.out.println("myLinkedList.size() = " + myLinkedList.size());
//
//        myLinkedList.clear();
//
//        System.out.println("myLinkedList = " + myLinkedList);
//        System.out.println("myLinkedList.size() = " + myLinkedList.size());
////        System.out.println("myLinkedList.get(3) = " + myLinkedList.get(3));
//
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        arrayList.remove(33);
    }
}
