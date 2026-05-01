package questions40;
public class q13 {
    public static void diff(int arr[],int brr[]){
            for(int num : arr){
                boolean found = false;
                for(int num2 : brr){
                    if(num == num2){
                        found = true;
                        break;
                    }
                }
                if(!found){
                    System.out.print(num + " ");
                }
            }

        
    }
    public static void main(String[] args) {
        int arr[] = {1,6789,2,3,4,5,6,7};
        int brr[] = {2,3,4,5,6,7,2,6,7,9,2,7};
        diff(arr,brr);
    }
}
