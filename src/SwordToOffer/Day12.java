package SwordToOffer;

import java.util.ArrayList;
import java.util.Stack;

public class Day12 {
    /** initialize your data structure here. */

    Stack<Integer> stack;
    Stack<Integer> formin;
    public Day12() {

        stack = new Stack<Integer>();
        formin = new Stack<Integer>();

    }

    public void push(int x) {
        stack.push(x);
        if(formin.isEmpty()==true||x<=formin.peek()){
            formin.push(x);
        }
    }

    public void pop() {
        int tmp = stack.peek();
        stack.pop();
        if(tmp==formin.peek())
        {
            formin.pop();
        }
    }

    public int top() {
        return  stack.peek();
    }

    public int min() {
        return formin.peek();
    }
}
