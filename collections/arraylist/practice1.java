package collections.arraylist;
import java.util.*;
public class practice1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop(1);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Stack empty: " + stack.isEmpty());
    }
}
