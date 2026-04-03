package ArrayPractice.Easy;

public class que10 {
    public static void main(String[] args) {
        //replace with neg with 0;
        int arr[] = {2,-3,4,-1,6};
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<0) arr[i] = 0;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
