package knowledge.ViolentRecursion;

import javafx.application.Preloader;

import java.sql.Statement;
import java.util.Stack;

/**
 * @author cong
 * @create 2023-02-04 18:40
 */
public class ReverseStackUsingRecursive {
    public static void reverse(Stack<Integer> stack){
        while (stack.isEmpty()){
            return;
        }
        int i=f(stack);
        reverse(stack);
        stack.push(i);

    }
    public static int f(Stack<Integer> stack) {
        int result=stack.pop();
        if (stack.isEmpty()){
            return result;
        }else {
            int last=f(stack);
            stack.push(result);
            return last;
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }
}
