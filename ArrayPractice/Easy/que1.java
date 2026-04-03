package ArrayPractice.Easy;

public class que1 {
    public static void main(String[] args) {
        //find idx of max and min elements
        int[] arr = {3,1,4,1,5};
        int maxid = 0;
        int minid = 0;
        for(int i = 0 ;i<arr.length;i++ ){
            if(arr[i]>arr[maxid]) maxid = i;
            if(arr[i]<arr[minid]) minid = i;
        }
        System.out.println(arr[maxid]+ "(" + maxid + ")");
        System.out.println(arr[minid]+ "(" + minid + ")");
    }
}
