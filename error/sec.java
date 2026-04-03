package error;
import java.util.Scanner;
public class sec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        try {
            
            int b = arr[10];
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of bounds");
        }
    }
}
