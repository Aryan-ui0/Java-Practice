package ArrayPractice.Easy;

public class que9 {
    //check if array contain duplicate
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,6};
        boolean flag = false;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                    flag = true;
                    break;
                }
            }

        }
        if(flag==true) System.out.println("Contain duplicates");
        else System.out.println("No duplicates");
    }
    
    
}
