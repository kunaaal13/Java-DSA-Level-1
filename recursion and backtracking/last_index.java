// https://nados.io/question/last-index

import java.util.*;

public class last_index {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(lastIndex(arr, 0, x));
        sc.close();
    }

    public static int lastIndex(int[] arr, int i, int x) {
        if (i == arr.length) {
            return -1;
        }

        int lastIndexOfSmaller = lastIndex(arr, i + 1, x);
        if (lastIndexOfSmaller == -1 && arr[i] == x) {
            return i;
        } else {
            return lastIndexOfSmaller;
        }

    }

}
