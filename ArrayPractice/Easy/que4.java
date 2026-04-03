package ArrayPractice.Easy;

public class que4 {
    public static void main(String[] args) {
        //find positive negative and zero
        int[] arr = {1,-2,4,5,0,0,-4};
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>0) pos++;
            else if(arr[i]<0) neg++;
            else if(arr[i]==0) zero++;
        }
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
        System.out.println("Zero: " + zero);
    }
}
