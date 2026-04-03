package error;
import java.util.Scanner;

class hi extends RuntimeException {
    public hi(String message) {
        super(message);
    }
}

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];



        try {
            int index = 10;

            if (index >= arr.length) {
                throw new hi("Array index out of bounds!");
            }

            System.out.println(arr[index]);

        } catch (hi e) {
            System.out.println(e.getMessage());
        }
    }
}