package questions40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            if (!freq.containsKey(num)) {
                freq.put(num, 1);
            } else {
                freq.put(num, freq.get(num) + 1);
            }
        }

        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int num : arr) {
            if (freq.get(num) == 1) {
                uniqueList.add(num);
            }
        }

        if (uniqueList.size() >0) {
            System.out.println(uniqueList.get(0));
        } else {
            System.out.println("No kth unique element found");
        }
    }
}
