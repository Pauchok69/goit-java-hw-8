package goit.hw_8.my_array_list;

import java.util.ArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        for (int i = 0; i < 9; i++) {
            myArrayList.add("String" + i);
        }

        System.out.println("myArrayList = " + myArrayList);
        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println("myArrayList.get(3) = " + myArrayList.get(3));
        System.out.println("myArrayList.remove(4) = " + myArrayList.remove(4));
        System.out.println("myArrayList = " + myArrayList);

        myArrayList.add(null);

        System.out.println("myArrayList = " + myArrayList);
        System.out.println("myArrayList.size() = " + myArrayList.size());

        myArrayList.clear();

        System.out.println("myArrayList = " + myArrayList);
        System.out.println("myArrayList.size() = " + myArrayList.size());
//        System.out.println("myArrayList.get(3) = " + myArrayList.get(3));

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.remove(33);
    }
}
