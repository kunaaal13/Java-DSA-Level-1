// https://nados.io/question/any-base-addition

import java.util.*;

public class any_base_addition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getSum(int b, int n1, int n2) {
        // write ur code here
        int ans = 0;
        int carry = 0;
        int power = 1;

        while (n1 > 0 || n2 > 0 || carry > 0) {
            int digit1 = n1 % 10;
            int digit2 = n2 % 10;

            int digit = digit1 + digit2 + carry;
            int remainder = digit % b;
            carry = digit / b;

            ans = ans + remainder * power;
            power = power * 10;

            n1 = n1 / 10;
            n2 = n2 / 10;
        }

        return ans;
    }
}
