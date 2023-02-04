import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * @author cong
 * @create 2022-02-28 22:06
 */

public class practice {

    //String.replace()方法
    public boolean isValid1(String s) {
        //正确数据只会是偶数的倍数
       if(s.length()%2==1) {
            return false;
        }
       //判断字符串中是否包含[] {} ()
        while (s.contains("[]")||s.contains("{}")||s.contains("()")){
            //把字符串中存在成对的括号替换为空
            s=s.replace("[]","");
            s=s.replace("()","");
            s=s.replace("{}","");
        }
        //判断字符串最后是否为空
        return s.equals("");
    }
    public boolean isValid2(String s){
        //正确数据只会是偶数的倍数
      if(s.length()%2==1) {
            return false;
        }

     Map<Character,Character> map=new HashMap<Character,Character>();
     map.put('(',')');
     map.put('[',']');
     map.put('{','}');
     map.put('?','?');
     //判断字符串首个字符是否为三个括号的左括号
     if (s.length()>0&&!map.containsKey(s.charAt(0))){
         return false;
     }
     //申请一个栈数据结构
     Stack<Character> stack=new Stack<>();
     //栈底放入一个其它字符
     stack.push('?');
     for(Character c:s.toCharArray()){
         //符合条件压栈
         if (map.containsKey(c)){
             stack.push(c);
         }
         //不符合判断返回逻辑值
         else if (map.get(stack.pop())!=c) {
             return false;
         }
     }
        return stack.size()==1;
    }
}



