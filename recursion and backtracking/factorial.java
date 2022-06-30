// https://nados.io/question/factorial

import java.util.*;

public class factorial {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(giveFactorial(n));
        s.close();
    }

    public static int giveFactorial(int n) {
        if (n == 0)
            return 1;

        int x = giveFactorial(n - 1);
        return x * n;
    }
}
