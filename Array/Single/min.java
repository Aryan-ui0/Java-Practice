package Array.Single;
import java.util.Scanner;

public class min {
    public static void main(String[] args) {
    int[] arr = new int[5];
    int smallest = 999999;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    for(int i = 0;i<n;i++){
        if(arr[i]<smallest) smallest = arr[i];
    }
    System.out.println(smallest);
    }
}
