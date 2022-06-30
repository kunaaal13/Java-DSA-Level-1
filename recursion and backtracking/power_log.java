// https://nados.io/question/power-logarithmic

import java.util.*;

public class power_log {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(power(x, n));
        s.close();
    }

    // x raised to power n
    public static int power(int x, int n) {
        if (n == 0)
            return 1;

        int half = power(x, n / 2);
        int ans = 0;

        if (n % 2 == 0)
            ans = half * half;
        else
            ans = x * half * half;

        return ans;

    }
}
