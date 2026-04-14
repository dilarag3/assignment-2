// queue (FIFO) based on MyLinkedList
public class MyQueue<T> {

    private MyLinkedList<T> list = new MyLinkedList<>();

    public void enqueue(T value) {
        list.add(value);
    }

    public T dequeue() {
        return list.remove(0);
    }

    public T peek() {
        return list.get(0);
    }
}
