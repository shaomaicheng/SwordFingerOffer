package offer.chenglei.q5;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                // stack1 不为空就压到 stack2
                int item = stack1.pop();
                stack2.push(item);
            }

        }
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            return 0;
        }
    }
}