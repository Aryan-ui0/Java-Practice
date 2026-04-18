package collections.arraylist;
import java.util.*;

public class one {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println(al);

        // int first = 0;
        // int last = al.size() - 1;

        // while (first < last) {
        //     int temp = al.get(first);
        //     al.set(first, al.get(last));
        //     al.set(last, temp);

        //     first++;
        //     last--;
        // }
        Collections.reverse(al);

        System.out.println(al);
    }
}