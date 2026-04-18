package collections.arraylist;

import java.util.*;

public class practice2 {
    public static void main(String[] args) {

        String s = "1234567890";
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }

        String reversed = "";
        while (!st.isEmpty()) {
            reversed += st.pop();
        }

        System.out.println("Reversed string: " + reversed);
    }
}