package knowledge.LikeFibonacciProblem;

/**
 * @author cong
 * @create 2023-05-11 16:14
 */
public class ZeroLeftOneStringNumber {
    public static int num(int N) {
        if (N < 1) {
            return 0;
        }
        return process(1,N);
    }

    private static int process(int i, int n) {
        if (i == n-1) {
            return 2;
        }
        if (i == n) {
            return 1;
        }
        return process(i+1,n)+process(i+2,n);
    }

    public static int getNum(int N) {
        if (N < 1) {
            return 0;
        }
        if (N == 1 || N == 2) {
            return N;
        }
        int[][] base = {
                {1, 1},
                {1, 0}
        };
        int[][] res = matrixPower(base, N - 2);
        return 2 * res[0][0] + res[1][0];
    }

    private static int[][] matrixPower(int[][] m, int p) {
        int[][] res = new int[m.length][m[0].length];
        for (int i = 0; i < res.length; i++) {
            res[i][i] = 1;
        }
        int[][] t = m;
        for (; p != 0; p >>= 1) {
            if ((p & 1) == 1) {
                res = product(res, t);
            }
            t = product(t, t);
        }
        return res;
    }

    private static int[][] product(int[][] a, int[][] b) {
        int m = a.length;
        int n = b.length;
        int l = a[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < l; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(num(8));
        System.out.println(getNum(8));
    }
}
