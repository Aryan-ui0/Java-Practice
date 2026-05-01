import java.util.*;

public class q14 {

    public static void secdistinct(int arr[]) {
        Arrays.sort(arr);

        int first = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != first) {
                System.out.println(arr[i]);
                return;
            }
        }

        System.out.println("Not found");
    }

    public static void main(String[] args) {
        int arr[] = {1,3,2,1,2,3,4,9,9,6,7};
        secdistinct(arr);
    }
}