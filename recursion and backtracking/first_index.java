// https://nados.io/question/first-index

import java.util.*;

public class first_index {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(firstIndex(arr, 0, x));
        sc.close();
    }

    public static int firstIndex(int[] arr, int i, int x) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == x) {
            return i;
        } else {
            return firstIndex(arr, i + 1, x);
        }

    }
}
