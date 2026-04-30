import java.util.*;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxFreq = 0;
        int result = arr[0];

        for (int i = 0; i < n; i++) {
            int freq = map.get(arr[i]);

            if (freq > maxFreq) {
                maxFreq = freq;
                result = arr[i];
            }
        }

        System.out.println(result);
    }
}