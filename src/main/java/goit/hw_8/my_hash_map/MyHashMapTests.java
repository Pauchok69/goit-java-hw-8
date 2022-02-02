package goit.hw_8.my_hash_map;

public class MyHashMapTests {
    public static void main(String[] args) {
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        System.out.println("myHashMap.size() = " + myHashMap.size());

        myHashMap.put(null, "Test");

        for (int i = 0; i < 99; i++) {
            myHashMap.put("Key " + i, "Value " + i);
        }

        myHashMap.put(null, "Test 222");

        System.out.println("myHashMap.size() = " + myHashMap.size());

        System.out.println("myHashMap.get(null) = " + myHashMap.get(null));
        System.out.println("myHashMap.get(\"Key 44\") = " + myHashMap.get("Key 44"));
        System.out.println("myHashMap.get(\"22\") = " + myHashMap.get("22"));

        System.out.println("myHashMap.get(\"Key 89\") = " + myHashMap.get("Key 89"));
        myHashMap.remove("Key 89");
        System.out.println("myHashMap.get(\"Key 89\") = " + myHashMap.get("Key 89"));
        System.out.println("myHashMap.size() = " + myHashMap.size());

        System.out.println("myHashMap.get(\"Key 0\") = " + myHashMap.get("Key 0"));
        myHashMap.remove("Key 0");
        System.out.println("myHashMap.size() = " + myHashMap.size());

        System.out.println("myHashMap.get(\"Key 44\") = " + myHashMap.get("Key 44"));
        myHashMap.remove("Key 44");
        System.out.println("myHashMap.get(\"Key 44\") = " + myHashMap.get("Key 44"));
        System.out.println("myHashMap.size() = " + myHashMap.size());
        myHashMap.remove("Key 44");
        System.out.println("myHashMap.size() = " + myHashMap.size());

        System.out.println("Do Clear");
        myHashMap.clear();
        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println("myHashMap.get(\"Key 44\") = " + myHashMap.get("Key 44"));
        System.out.println("myHashMap.get(null) = " + myHashMap.get(null));


    }
}
