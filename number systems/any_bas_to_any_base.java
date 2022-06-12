// https://nados.io/question/any-base-to-any-base

import java.util.*;

public class any_bas_to_any_base {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int dn = getValueInFinalBase(n, sourceBase, destBase);
        System.out.println(dn);
        scn.close();
    }

    public static int getValueInFinalBase(int n, int sourceBase, int destBase) {
        // write your code here
        int dec = getValueIndecimal(n, sourceBase);

        int ans = getValueInBase(dec, destBase);

        return ans;
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

    public static int getValueInBase(int n, int b) {
        // write code here
        int ans = 0;
        int i = 1;
        while (n > 0) {
            int remainder = n % b;
            ans = ans + remainder * i;
            i = i * 10;
            n = n / b;
        }

        return ans;
    }
}
