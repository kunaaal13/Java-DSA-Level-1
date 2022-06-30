// https://nados.io/question/display-array

import java.util.*;

public class display_arr {
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

        System.out.println(arr[n]);
        display(arr, n + 1);

    }
}
