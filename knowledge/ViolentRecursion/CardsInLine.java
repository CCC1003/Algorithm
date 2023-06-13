package knowledge.ViolentRecursion;

/**
 * @author cong
 * @create 2023-04-01 10:32
 */
public class CardsInLine {
    //根据规则，返回获胜者的分数
    public static int win1(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return Math.max(f(arr, 0, arr.length - 1), g(arr, 0, arr.length - 1));
    }

    //arr[L..R],先手获得的最好分数返回
    private static int f(int[] arr, int L, int R) {
        if (L == R) {
            return arr[L];
        }
        return Math.max(arr[L] + g(arr, L + 1, R), arr[R] + g(arr, L, R - 1));
    }

    //arr[L..R] ,后手获得的最好分数返回
    private static int g(int[] arr, int L, int R) {
        if (L == R) {
            return 0;
        }
        return Math.min(f(arr, L + 1, R), f(arr, L, R - 1));
    }

    public static int dpWin(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int N = arr.length;
        int[][] f = new int[N][N];
        int[][] g = new int[N][N];
        for (int i = 0; i < N; i++) {
            f[i][i] = arr[i];
        }
//        g[i][i]=0
        for (int startCol = 1; startCol < N; startCol++) {
            int L = 0;
            int R = startCol;
            while (R < N) {
                f[L][R] = Math.max(arr[L] + g[L + 1][R], arr[R] + g[L][R - 1]);
                g[L][R] = Math.min(f[L + 1][R], f[L][R - 1]);
                L++;
                R++;
            }
        }
        return Math.max(f[0][arr.length - 1], g[0][arr.length - 1]);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 4, 5, 8, 1, 6, 0, 3, 4, 6, 1, 7 };
        System.out.println(win1(arr));
        System.out.println(dpWin(arr));
    }
}
