// https://nados.io/question/any-base-to-decimal

import java.util.*;

public class any_base_to_decimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
        scn.close();
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here
        int ans = 0;
        int i = 1;

        while (n > 0) {
            int remainder = n % 10;
            ans = ans + remainder * i;
            i = i * b;
            n = n / 10;
        }

        return ans;
    }

}
