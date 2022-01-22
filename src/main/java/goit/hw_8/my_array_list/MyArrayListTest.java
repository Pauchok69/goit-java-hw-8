package goit.hw_8.my_array_list;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        for (int i = 0; i < 9; i++) {
            myArrayList.add(i);
        }

        System.out.println("myArrayList = " + myArrayList);
        System.out.println("myArrayList.size() = " + myArrayList.size());
    }
}
