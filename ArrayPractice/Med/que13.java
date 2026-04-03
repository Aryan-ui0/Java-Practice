package ArrayPractice.Med;

public class que13 {
    public static void main(String[] args) {
        int[] arr= {-2,3,1,-5,4};
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                int currsum = 0;
                for(int k = i;k<=j;k++){
                    currsum +=arr[k];

                }
                maxsum = Math.max(maxsum,currsum);
            }
        }
        System.out.println(maxsum);
    }
    
}
