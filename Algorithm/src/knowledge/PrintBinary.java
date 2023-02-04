package knowledge;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

/**
 * @author cong
 * @create 2022-04-02 21:13
 */
public class PrintBinary {
    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num = 4;
        print(num);
    }
}
