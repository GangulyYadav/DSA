package Practice;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        System.out.println(arr.contains(231));
        arr.set(0,99);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        System.out.println(arr);

        System.out.println(arr.get(5)); // arr[i] will not work here
//        arr.add(10);
//        for (int i = 0; i <arr.size() ; i++) {
//
//        }
    }
}
