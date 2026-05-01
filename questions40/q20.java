import java.util.HashSet;
public class q20 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,0,6,7};
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
    }
    int k = 3;
    for(int num : arr){
        if(set.contains(k - num)){
            System.out.println(num + " " + (k - num));
            set.remove(num);
            set.remove(k - num);
        }

    }
}
}