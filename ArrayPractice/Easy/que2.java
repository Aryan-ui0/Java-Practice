package ArrayPractice.Easy;

public class que2 {
    public static void main(String[] args) {
        //find count of number which are greater than avg of array
        int[] arr = {1,2,3,4,5};
        int avg = 0;
        int sum = 0;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        avg = sum/arr.length;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>avg) count++;
        }
        System.out.println( "The number of elements greater than average : " + count);
    }
}
