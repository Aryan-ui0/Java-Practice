
public class fifteen {
    public static int found(int [] brr, int k){
        for(int num : brr){
            if(num == k) return 1;
        }
        return 0;
    }
    public static void nod(int []arr){
        int [] brr = new int[100];
        int i = 0;
        for(int num : arr){
            if(found(brr, num) == 0){
                brr[i++] = num;
            }
        }
        for(int k = 0;k<i;k++){
            System.out.print(brr[k] + " ");
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,4,2,3,8,1,3,5};
        nod(arr); 
    }
}
