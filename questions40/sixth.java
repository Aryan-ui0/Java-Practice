package questions40;
import java.util.*;
public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxelem = sc.nextInt();
        int sumall = 0;
        for(int i= 1;i<=maxelem;i++){
            sumall+=i;
        }
        int arrsum =0;
        for(int i = 0;i<n;i++){
            arrsum+=arr[i];
        }
        System.out.println(sumall-arrsum);
    }
}
