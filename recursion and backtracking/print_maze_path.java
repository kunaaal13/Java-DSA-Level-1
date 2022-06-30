// https://nados.io/question/print-maze-paths

import java.util.*;

public class print_maze_path {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        printMazePaths(1, 1, m, n, "");
        s.close();

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int r, int c, int dr, int dc, String psf) {
        if (r > dr || c > dc) {
            return;
        }

        if (r == dr && c == dc) {
            System.out.println(psf);
            return;
        }

        printMazePaths(r + 1, c, dr, dc, psf + "v");
        printMazePaths(r, c + 1, dr, dc, psf + "h");

    }
}
