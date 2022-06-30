// https://nados.io/question/max-of-an-array

import java.util.*;

public class max_of_arr {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxOfArray(arr, 0));
        sc.close();
    }

    public static int maxOfArray(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }

        int maxInSmallerArray = maxOfArray(arr, i + 1);

        int max = 0;
        if (arr[i] > maxInSmallerArray) {
            max = arr[i];
        } else {
            max = maxInSmallerArray;
        }

        return max;
    }
}
