package collections.arraylist;

import java.util.ArrayList;

public class five {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);

        System.out.println("Original List: " + al);

        for (int i = al.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                al.remove(i);
            }
        }

        System.out.println("After removing even index elements: " + al);
    }
}