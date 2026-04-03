package ArrayPractice.Easy;

public class que15 {
    public static void main(String[] args) {
        //find the max elem only on even idx;
        int max = -999999;
        int[] arr = {3,14,9,22,5,17};
        for(int i = 0;i<arr.length;i++){
            if(i%2!=0 && arr[i]>max) max = arr[i];
        }
        System.out.println(max);
        
    }
    
}
