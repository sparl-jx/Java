import java.util.Stack;

public class TestDemo {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
            myStack.push(1);
            myStack.push(2);
            myStack.push(3);
            System.out.println(myStack.peek());
        }


    public static void main1(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek()); //拿到栈顶元素但不删除
        System.out.println(stack.pop());            //删除栈顶元素
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.search(2)); //在倒数第几个
        System.out.println(stack.size());


    }
}
