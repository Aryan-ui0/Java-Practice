package ArrayPractice.Easy;

public class que12 {
    public static void main(String[] args) {
        //sec smallest dictinct elem
        int[] arr = {4,2,9,2,2,5};
        int min = 999999;
        int secmin = 999999;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                secmin = min;
                min = arr[i];
            }

        }
        System.out.println(secmin);
    }
}
