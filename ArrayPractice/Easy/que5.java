package ArrayPractice.Easy;

public class que5 {
    public static void main(String[] args) {
        //find diff between max and min
        int[] arr = {4,9,1,7,3};
        int max =-999999;
        int min =999999;
        int diff = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
        }
        diff = max - min;
        System.out.println("Difference is: " + diff);
    }
}
