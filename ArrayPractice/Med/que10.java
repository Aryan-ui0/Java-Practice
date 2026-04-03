package ArrayPractice.Med;

public class que10 {
    //find sum of all subarrays
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        for(int i = 0;i<arr.length;i++){
            int sum = 0;

            for(int j = i;j<arr.length;j++){
                sum = sum+arr[j];

                System.out.println(sum);

                
                
            }
            

        }
    }
    
}
