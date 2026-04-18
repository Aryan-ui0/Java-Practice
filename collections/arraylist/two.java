package collections.arraylist;
import java.util.*;

public class two {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println(al);

        int max = Integer.MIN_VALUE;

        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            int num = itr.next();
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Max: " + max);
    }
}