// https://nados.io/question/all-indices-of-array

import java.util.*;

public class all_indices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
        int[] res = allIndices(arr, x, 0, 0);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] allIndices(int[] arr, int x, int i, int count) {
        // write ur code here

        if (i == arr.length) {
            return new int[count];
        }

        if (arr[i] == x) {
            int[] res = allIndices(arr, x, i + 1, count + 1);
            res[count] = i;
            return res;
        } else {
            int[] res = allIndices(arr, x, i + 1, count);
            return res;
        }

    }
}
