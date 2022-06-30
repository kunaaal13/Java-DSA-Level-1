// https://nados.io/question/print-decreasing

import java.util.*;

public class print_decreasing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printDecreasing(n);
        s.close();
    }

    public static void printDecreasing(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printDecreasing(n - 1);
    }

}