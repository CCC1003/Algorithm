package knowledge.LikeFibonacciProblem;

/**
 * @author cong
 * @create 2023-05-09 16:42
 */
public class CowProblem {
    public static int cows(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2 || n == 3) {
            return n;
        }
        int[][] base = {
                {1, 1, 0},
                {0, 0, 1},
                {1, 0, 0},
        };
        int[][] res = matrixPower(base, n - 3);
        return 3 * res[0][0] + 2 * res[1][0] + res[2][0];
    }

    private static int[][] matrixPower(int[][] m, int p) {
        int[][] res = new int[m.length][m[0].length];
        for (int i = 0; i < res.length; i++) {
            res[i][i] = 1;
        }
        int[][] t = m;
        for (; p != 0; p >>= 1) {
            if ((p & 1) != 0) {
                res = product(res, t);
            }
            t = product(t, t);
        }
        return res;
    }

    private static int[][] product(int[][] a, int[][] b) {
        int m = a.length;
        int n = b[0].length;
        int k = a[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < k; l++) {
                    res[i][j] += a[i][l] * b[l][j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(cows(7));
    }

}
