// https://nados.io/question/get-stair-paths

import java.util.*;

public class get_stair_path {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<String> result = getStairPaths(n);
        System.out.println(result);
        s.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        } else if (n < 0) {
            ArrayList<String> result = new ArrayList<>();
            return result;
        }

        ArrayList<String> paths1 = getStairPaths(n - 1);
        ArrayList<String> paths2 = getStairPaths(n - 2);
        ArrayList<String> paths3 = getStairPaths(n - 3);

        ArrayList<String> result = new ArrayList<String>();

        for (String path : paths1) {
            result.add("1" + path);
        }

        for (String path : paths2) {
            result.add("2" + path);
        }

        for (String path : paths3) {
            result.add("3" + path);
        }

        return result;
    }

}
