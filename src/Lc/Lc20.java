package Lc;

import java.util.HashMap;
import java.util.Stack;

public class Lc20 {
    private HashMap<Character, Character> valid = new HashMap<>();

    public void setValid() {
        valid.put(')','(');
        valid.put('}','{');
        valid.put(']','[');
    }
    public boolean isValid(String s) {


        Stack<Character> stack = new Stack<>();
        setValid();
        for (int i = 0; i < s.length(); i++) {
            char nowChar = s.charAt(i);
            if(!valid.containsKey(nowChar)){
                stack.push(nowChar);
            }
            else
            {
                if(!stack.empty()&&stack.peek()==valid.get(nowChar))
                {
                    stack.pop();
                }
                else if(!stack.empty()&&stack.peek()!=valid.get(nowChar))
                {
                    return false;
                }
                else
                {
                    stack.push(nowChar);
                }
            }

        }
        return stack.empty();
    }
}
