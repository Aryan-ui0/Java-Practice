package collections.arraylist;
import java.util.*;
public class three {
    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<>();
        al.add('a');
        al.add('b');
        al.add('c');
        al.add('c');
        al.add('a');

        System.out.println("Before: " + al);

        for (int i = 0; i < al.size(); i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i).equals(al.get(j))) {
                    al.remove(j);
                    j--; 
                }
            }
        }

        System.out.println("After: " + al);
    }
}