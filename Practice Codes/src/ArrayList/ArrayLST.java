package ArrayList;

import java.util.ArrayList;

public class ArrayLST {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(10);
        arr.add(5);
        arr.add(30);
        System.out.println(arr);
        arr.add(0, 99);
        System.out.println(arr);

        System.out.println(arr.get(2));  // Get a Number by index number
        System.out.println(arr.indexOf(30)); // to get the index number

        arr.set(1, 50);
        System.out.println(arr);
        System.out.println(arr.size());

        System.out.println("---------------------");

        for(int i =0; i< arr.size(); i++){
            System.out.println(arr.get(i));
        }
        System.out.println("---------------------");

        arr.forEach(x -> System.out.println(x));


    }
}
