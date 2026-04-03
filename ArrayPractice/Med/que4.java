package ArrayPractice.Med;

public class que4 {
    //find all the sub arrays whose sum is zero
    public static void main(String[] args) {
        int arr[] = {1,-1,2,-2,3};
        for(int i = 0;i<arr.length;i++){
            int sum = 0;

            for(int j = i;j<arr.length;j++){
                sum = sum+arr[j];

                if(sum ==0){
                    for(int k = i;k<=j;k++){
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }

                
                
            }
            

        }
    }
    
}
