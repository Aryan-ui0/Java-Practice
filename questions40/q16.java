import java.util.*;
public class q16 {

    public static void main(String[] args) {
        int []arr = {1,2,1,4,2,4,3,8,6,5,7,9};
        int k = 3;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num, 0)+1); 
        }
        int count = 0;
        for(int num : arr){
            if(map.get(num)== 1){
                count++;
                if(count == k) System.out.println(num);
            }
        }
    }
}
