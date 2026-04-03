package ArrayPractice.Easy;

public class que7 {
    public static void main(String[] args) {
        //write the prog to find the occurence of x
        int idx = -1;
        int [] arr = {5,3,7,3,9,3};
        int key = 3;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==key){
                idx = i;
                break;
            }
            
        }
        System.out.println("First occurence at index " + idx);
    }
    
}
