// https://nados.io/question/print-permutations

import java.util.*;

public class print_permutations {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        printPermutations(str, "");
        s.close();
    }

    public static void printPermutations(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // i ka left part
            String left = str.substring(0, i);

            // i ka right part
            String right = str.substring(i + 1);

            // i ke bina poori
            String rest = left + right;
            printPermutations(rest, asf + ch);
        }
    }
}
