package questions;
import java.util.*;
public class q12 {
    public void intersection(int arr[],int brr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        for(int num : brr){
            if(set.contains(num)){
                System.out.print(num + " ");
                set.remove(num);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 3, 2, 5};
        int[] brr = {3, 4, 5, 6};
        q12 obj = new q12();
        obj.intersection(arr,brr);
    }
}
