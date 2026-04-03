package ArrayPractice.Easy;

public class que8 {
    //find last occurence of x
    public static void main(String[] args) {
        int arr[] = {5,3,7,3,9,3};
        int idx = -1;
        int key = 3;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==key) idx = i;
        }
        System.out.println("Last Occurence is: " + idx);
    }
    
}
