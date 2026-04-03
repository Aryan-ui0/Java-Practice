package ArrayPractice.Easy;

public class que11 {
    public static void main(String[] args) {
        //count elements that are multiple of k
        int count=0;
        int arr[] = {10,15,22,30,18,25,40};
        int key  = 5;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%key==0) count++;
        }
        System.out.println(count);
    }
}
