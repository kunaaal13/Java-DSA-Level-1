// https://nados.io/question/get-kpc

import java.util.*;

public class keypad_combinations {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        ArrayList<String> result = getKPC(str);
        System.out.println(result);
        s.close();

    }

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    // 573
    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> result = new ArrayList<String>();
            result.add("");
            return result;
        }

        // take the first character out
        char ch = str.charAt(0); // 5
        String rest = str.substring(1); // 73

        // recursion for rest characters
        ArrayList<String> recursionResult = getKPC(rest);

        // add first character values to each of the strings in recursionResult
        ArrayList<String> result = new ArrayList<String>();

        String codeForCh = codes[ch - '0'];

        for (int i = 0; i < codeForCh.length(); i++) {
            char value = codeForCh.charAt(i);
            for (String s : recursionResult) {
                result.add(value + s);
            }
        }

        return result;
    }

}
