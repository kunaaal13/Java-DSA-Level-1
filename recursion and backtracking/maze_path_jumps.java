// https://nados.io/question/get-maze-path-with-jumps

import java.util.*;

public class maze_path_jumps {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        ArrayList<String> result = getMazePaths(1, 1, n, m);

        System.out.println(result);

        s.close();

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int r, int c, int dr, int dc) {
        if (r == dr && c == dc) {
            ArrayList<String> result = new ArrayList<String>();
            result.add("");
            return result;
        }

        ArrayList<String> result = new ArrayList<String>();

        // for horizontal moves
        for (int h = 1; h <= dc - c; h++) {
            ArrayList<String> hpath = getMazePaths(r, c + h, dr, dc);

            for (String s : hpath) {
                result.add("h" + h + s);
            }
        }

        // for vertical moves
        for (int v = 1; v <= dr - r; v++) {
            ArrayList<String> vpath = getMazePaths(r + v, c, dr, dc);

            for (String s : vpath) {
                result.add("v" + v + s);
            }
        }

        // for diagonal moves
        for (int d = 1; d <= dr - r && d <= dc - c; d++) {
            ArrayList<String> dpath = getMazePaths(r + d, c + d, dr, dc);

            for (String s : dpath) {
                result.add("d" + d + s);
            }
        }

        return result;
    }

}
