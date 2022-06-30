// https://nados.io/question/power-linear

import java.util.*;

public class power_linear {
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

        int prev = power(x, n - 1);
        int ans = x * prev;

        return ans;

    }

}
