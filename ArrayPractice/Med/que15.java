package ArrayPractice.Med;

public class que15 {
    public static void main(String[] args) {
        int arr[]= {1,2,3,1,1,1};
        int k = 6;
        int count = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int currsum = 0;
            for(int j = i;j<n;j++){
                
                int temp=0;
                currsum += arr[j];
                if(currsum==k){
                    for(int l = i;l<=j;l++){
                        temp++;
                    }
                    count = Math.max(count,temp);
                }
            }
        }
        System.out.println(count);
    }
}
