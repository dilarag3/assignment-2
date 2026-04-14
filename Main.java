// test class
public class Main {
    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());

        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.dequeue());
    }
}
