package collections;
import java.util.HashMap;
public class q18 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = {2, 3, 4, 3, 2, 5};
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : arr){
            if(map.get(num) == 1){
                System.out.println(num);
                return;
            }
        }
        System.out.println("no unique element found");
    }
}
