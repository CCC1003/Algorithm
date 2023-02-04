package _1_2;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author cong
 * @create 2022-02-12 10:27
 */
class Student{
    int Id;
    int ch;
    int ma;
    int en;
    int sum;

    public Student(int id, int ch, int ma, int en) {
        Id = id;
        this.ch = ch;
        this.ma = ma;
        this.en = en;
        this.sum = ch+ma+en;
    }
}
public class P1093 {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer in=new StreamTokenizer(br);
        PrintWriter pr=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        in.nextToken();
        int n=(int)in.nval;
        Student[] students=new Student[n];
        for (int i=0;i<n;i++) {
            in.nextToken();
            int ch=(int)in.nval;
            in.nextToken();
            int ma=(int)in.nval;
            in.nextToken();
            int en=(int)in.nval;
            students[i]=new Student(i+1, ch,ma,en);
        }
        Comparator<Student> comp=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.sum>o2.sum){
                        return -1;
                }else if(o1.sum==o2.sum){
                    if (o1.ch>o2.ch){
                        return -1;
                    }else if(o1.ch==o2.ch) {
                        if (o1.Id < o2.Id) {
                            return -1;
                        } else {
                            return 1;
                        }
                    }else{
                        return 1;
                    }
                }
                return 1;
            }
        };
        Arrays.sort(students,comp);
        for (int i=0;i<5;i++){
            pr.println(students[i].Id+" "+students[i].sum);
        }
        pr.flush();
    }

}
