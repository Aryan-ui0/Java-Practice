package Array.Single;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
    float[] arr = new float[5];
    float sum = 0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextFloat();
    }
    for(int i = 0;i<n;i++){
        sum+=arr[i];
    }
    System.out.println(String.format("%.2f", sum));
    }
    
}
