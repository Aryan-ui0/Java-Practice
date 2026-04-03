package Array.Single;
import java.util.Scanner;

public class seclar {
    public static void main(String[] args) {
    int[] arr = new int[5];
    int largest = -999999;
    int seclar = -99999;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    for(int i = 0;i<n;i++){
        if(arr[i]>largest) largest = arr[i];
    }
    for(int i = 0;i<n;i++){
        if(arr[i]>seclar && arr[i]!=largest) seclar = arr[i];
    }
    System.out.println(seclar);
    }
}
