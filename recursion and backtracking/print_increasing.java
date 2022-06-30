// https://nados.io/question/print-increasing

import java.util.*;

public class print_increasing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printIncreasing(n);
        s.close();
    }

    public static void printIncreasing(int n) {
        if (n == 0)
            return;

        // fill stack
        printIncreasing(n - 1);

        // while returning from stack
        System.out.println(n);
    }
}
