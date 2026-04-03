package ArrayPractice.Med;

public class que14 {
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    int k = 99;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;

            for(int j = i;j<arr.length;j++){
                sum = sum+arr[j];

                if(sum ==k){
                    System.out.println("Yes");
                    return;
                }

                
                
            }
            

        }
        System.out.println("NO");
    }
    
}
