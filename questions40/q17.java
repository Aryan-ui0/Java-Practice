import java.util.HashMap;
import java.util.Map;
public class q17 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 3, 2, 5};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i,0 )+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() >= 1){
                System.out.println(entry.getKey() + " is repeated " + entry.getValue() + " times");
            }
        }
    }
}
