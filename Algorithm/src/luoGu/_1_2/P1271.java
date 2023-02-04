package _1_2;

import java.io.*;

/**
 * @author cong
 * @create 2022-02-09 20:30
 */
public class P1271 {
    public static void main(String[] args) throws IOException {
        //System.in  从控制台输入数据
        //new InputStreamReader  字节输入流 读取字节并将其解码为字符
        // new BufferedReader  构建一个BufferedReader 里面存放在控制台输入的字节转换后成的字符  具有缓存功能
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //StreamTokenizer类进行输入 输入的效率要高点。
//        1、类java.io.StreamTokenizer可以获取输入流并将其分析为Token（标记）。
//        StreamTokenizer的nextToken方法读取下一个标记
//
//        2、默认情况下，StreamTokenizer认为下列内容是Token:字母、数字、除c和c++注释符号以外的其他符号。
//        如符号“/”不是Token，注释后的内容也不是，而"/"是Token。单引号和双引号以及其总的内容，只能算一个Token。
//
//        3、为了提高效率，使用BufferedReader
        StreamTokenizer in = new StreamTokenizer(br);
//        java.io.PrintWriter
//
//        具有自动行刷新的缓冲字符输出流，特点是可以按行写出字符串，并且可以自动行刷新。
//
//        java.io.BufferedWriter是缓冲字符输出流，内部有缓冲区可以进行块写操作提供效率，
//
//        而PrintWriter就是通过连接它实现的缓冲功能（PW的很多构造方法内部自动连接它）。
        PrintWriter pr=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        in.nextToken();  //从该记号赋予器的输入流中解析下一个记号
        int n = (int)in.nval; //默认为double,需要强制转型
        //调用nextToken()方法以后，如果标记是字符串，可用 String s=st.sval,如果是整数用 int n=(int) st.nval得到。
        in.nextToken();
        int m = (int)in.nval;
        int[] bucket=new int[n+1];
        for (int i = 0; i < m; i++) {
            in.nextToken();
            bucket[(int)in.nval]++;
        }
        int j=0;
        for (int i=0;i<bucket.length;i++){
            while (bucket[i]-->0){
                pr.print(i+" ");
            }
        }
        pr.flush();
    }
}
