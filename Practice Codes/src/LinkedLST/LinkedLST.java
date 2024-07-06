package LinkedLST;

import java.util.LinkedList;
import java.util.List;

public class LinkedLST {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList(List.of(1, 2, 3));
        arr.add(12);
        System.out.println(arr);
        System.out.println(arr.contains(12));
        System.out.println(arr.indexOf(1));

        arr.forEach(n-> System.out.println(n*10));    ///////// Learn about forEach()///////

    }
}
