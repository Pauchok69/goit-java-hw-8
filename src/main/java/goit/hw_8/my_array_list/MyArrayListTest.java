package goit.hw_8.my_array_list;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        for (int i = 0; i < 9; i++) {
            myArrayList.add("String" + i);
        }

        System.out.println("myArrayList = " + myArrayList);
        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println("myArrayList.get(3) = " + myArrayList.get(3));
    }
}
