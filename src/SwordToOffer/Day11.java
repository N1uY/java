package SwordToOffer;

import java.util.ArrayList;
import java.util.Stack;

public class Day11 {

    public Stack<Integer> stack1;
    public Stack<Integer> stack2;

    public Day11() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();

    }

    public void appendTail(int value) {
        Integer coverage = value;
        stack1.push(coverage);
        if (stack2.empty() == true) {
            while (stack1.empty() != true) {
                Integer tmp;
                tmp = stack1.pop();
                stack2.add(tmp);
            }
        }
    }

    public int deleteHead() {
        if (stack2.empty() == false) {
            Integer out = stack2.pop();
            int rel = out.intValue();
            return rel;
        } else if (stack1.empty() == false) {
            while (stack1.empty() == false) {
                Integer tmp;
                tmp = stack1.pop();
                stack2.push(tmp);
            }
            return stack2.pop();
        } else {
            return -1;
        }
    }
}
