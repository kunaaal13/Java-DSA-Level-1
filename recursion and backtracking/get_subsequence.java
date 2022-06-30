// https://nados.io/question/get-subsequence

import java.util.*;

public class get_subsequence {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        ArrayList<String> result = getSubsequence(str);
        System.out.println(result);
        s.close();
    }

    public static ArrayList<String> getSubsequence(String str) {
        if (str.length() == 0) {
            ArrayList<String> result = new ArrayList<String>();
            result.add("");
            return result;
        }

        // take out first char
        char ch = str.charAt(0);

        // rest of the string
        String rest = str.substring(1);

        ArrayList<String> recursionResult = getSubsequence(rest);

        // add or ignore first char to each of the strings in recursionResult
        ArrayList<String> result = new ArrayList<String>();
        for (String s : recursionResult) {
            // Add
            result.add(ch + s);

            // Ignore
            result.add(s + "");
        }

        return result;
    }

}
