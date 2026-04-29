package questions40;
import java.util.*;
public class seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for(int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        int sum1 =0;
        int sum2 =0;
        for(int i = 0;i<n;i++){
            sum1+=arr1[i];
        }
        for(int i = 0;i<m;i++){
            sum2+=arr2[i];
        }
        System.out.println(sum1-sum2);
    }
}
