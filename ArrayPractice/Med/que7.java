package ArrayPractice.Med;

public class que7 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7};
        int[] arr2 = {2, 5, 6};

        int fir = 0, sec = 0;
        int[] res = new int[arr1.length + arr2.length];
        int i = 0;

        while (fir < arr1.length && sec < arr2.length) {
            if (arr1[fir] <= arr2[sec]) {
                res[i++] = arr1[fir++];
            } else {
                res[i++] = arr2[sec++];
            }
        }

        while (fir < arr1.length) {
            res[i++] = arr1[fir++];
        }

        while (sec < arr2.length) {
            res[i++] = arr2[sec++];
        }

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
