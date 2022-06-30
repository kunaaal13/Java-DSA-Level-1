
// https://nados.io/question/print-increasing-decreasing
import java.util.*;

public class print_increasing_decreasing {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pdi(n);
        s.close();
    }

    public static void pdi(int n) {
        if (n == 0) {
            return;
        }

        // for decreasing
        System.out.println(n);

        pdi(n - 1);

        // for increasing
        System.out.println(n);
    }
}
