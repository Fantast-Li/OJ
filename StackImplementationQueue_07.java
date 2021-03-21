package 剑指offer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
//思路 1.添加对于队列和栈一样  假设stack1为添加的容器 直接添加就可以
// 2. 删除操作 先判断二个栈是否为空 为空抛出异常
// 3. 判断stack 2 是否为空  为空将stack1 的所有元素添加 到 stack2 里面 出栈从stack2 出.

public class StackImplementationQueue_07{
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        //添加操作
        stack1.push(node);
    }

    public int pop() {
        if (stack1.empty()&&stack2.empty()) {
            throw new RuntimeException("队列为空!");
        }
        if (stack2.empty()) {
            while (!stack1.empty()){
            stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
//  二个对列 变成栈
//思路
//    pop 方法 看二个栈中是否有元素 没有申明异常 pop可以直接从 queue1 取出.
    Queue<Integer> Queue1 = new LinkedList<>();
    Queue<Integer> Queue2 = new LinkedList<>();
    public void myPush(int node ) {

    }
    public int myPop() {
        // TODO: 2021/3/19  明天实现
        int o  = 1 ;
        return o;
    }
    public static void main(String[] args) {
        Stack stack = new Stack();

    }
}
