// https://nados.io/question/any-base-subtraction

import java.util.*;

public class any_base_subtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getDifference(int b, int n1, int n2) {
        // write your code here
        int ans = 0;
        int borrow = 0;
        int power = 1;

        while (n2 > 0) {
            int digit1 = n1 % 10;
            int digit2 = n2 % 10;

            digit2 -= borrow;

            if (digit2 < digit1) {
                digit2 += b;
                borrow = 1;
            } else {
                borrow = 0;
            }

            int digit = digit2 - digit1;
            ans = ans + digit * power;

            power = power * 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
        }

        return ans;
    }
}
