package ArrayPractice.Med;
import java.util.Scanner;
public class que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int currsum = arr[0];
        int maxsum = arr[0];
        for(int i = 1;i<arr.length;i++){
            currsum = Math.max(arr[i],currsum + arr[i]);
            maxsum = Math.max(maxsum,currsum);


        }
        System.out.println(maxsum);
    }
}
