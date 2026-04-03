package ArrayPractice.Easy;

public class que14 {
    //find the sum of odd indices and even
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int even = 0;
        int odd = 0;
        for(int i = 0;i<arr.length;i++){
            if(i%2==0){
                even+=arr[i];
            }
            else odd+=arr[i];
        }
        System.out.println("Sum at even indices are : " + even);
        System.out.println("Sum at odd indices are : " + odd);
    }
}
