// https://nados.io/question/decimal-to-any-base

import java.util.*;

public class decimal_to_any_base {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b = s.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
        s.close();
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