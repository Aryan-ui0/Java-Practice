package ArrayPractice.Med;

public class que1 {
    public static void main(String[] args) {
        int first = 0;
        int[] arr = {1,2,3,4,5,6,7};
        int last = arr.length-1;

        for(int i = 0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
