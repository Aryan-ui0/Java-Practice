package ArrayPractice.Easy;
import java.util.Scanner;
public class que6 {
    public static void main(String[] args) {
        //count number of times x occured in array
        int count = 0;
        int arr[] = {2,4,2,5,2,8};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==x) count++;
        }
        System.out.println(x+ " occur "+ count + " times");
    }
}
