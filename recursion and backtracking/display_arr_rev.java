// https://nados.io/question/display-array-in-reverse

import java.util.*;

public class display_arr_rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5 };
        display(arr, 0);
        sc.close();
    }

    public static void display(int[] arr, int n) {
        if (n == arr.length) {
            return;
        }

        display(arr, n + 1);
        System.out.println(arr[n]);

    }
}
