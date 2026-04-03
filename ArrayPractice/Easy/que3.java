package ArrayPractice.Easy;

public class que3 {
    public static void main(String[] args) {
        //check if array is sorted or not
        int[] arr = {1,2,3,4,5};
        boolean flag = true;
        for(int i = 1;i<arr.length;i++){
            if(arr[i-1]<arr[i]) flag = true;
            else {flag = false; break;}
        }
        if(flag==true) System.out.println("Array is sorted");
        else System.out.println("Array is unsorted");
    }
}
