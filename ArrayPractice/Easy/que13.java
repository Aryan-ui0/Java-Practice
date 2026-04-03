package ArrayPractice.Easy;

public class que13 {
    //count how many elements are perfect square
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,9,10,16,18};
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            int sqrt = (int) Math.sqrt(arr[i]);
            if(sqrt*sqrt==arr[i]) count++;
        }
        System.out.println(count);
    }
}
