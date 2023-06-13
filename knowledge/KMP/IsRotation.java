package knowledge.KMP;

import com.sun.corba.se.spi.ior.IORFactories;

/**
 * @author cong
 * @create 2023-06-13 10:08
 */
public class IsRotation {
    public static boolean isRotation(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }
        String strA=a+a;
        String strB=b;
        return getIndexOf(strA,strB)!=-1;
    }

    //KMP
    private static int  getIndexOf(String a, String b) {
        if (a.length()<b.length()) {
            return -1;
        }
        char[] strA=a.toCharArray();
        char[] strB=b.toCharArray();
        int x=0;
        int y=0;
        int[] next=getNextArray(strA);
        while (x<a.length()&&y<b.length()) {
            if (strA[x] == strB[y]) {
                x++;
                y++;
            } else if (next[y] == -1) {
                x++;
            }else{
                y=next[y];
            }
        }
        return y==strB.length?x-y:-1;
    }

    private static int[] getNextArray(char[] str) {
        if (str.length==0) {
            return null;
        }
        int[] next=new int[str.length];
        next[0]=-1;
        next[1]=0;
        int i=2;
        int cn = 0;
        while (i<next.length) {
            if (str[i-1] == next[cn]) {
                next[i++]=++cn;
            } else if (cn>0) {
                cn=next[cn];
            }else {
                next[i++] = 0;
            }
        }
        return next;
    }

    public static void main(String[] args) {
        String a= "123456";
        String b= "612345";
        System.out.println(isRotation(a,b));
    }
}
