// stack (LIFO) based on MyArrayList
public class MyStack<T> {

    private MyArrayList<T> list = new MyArrayList<>();

    public void push(T value) {
        list.add(value);
    }

    public T pop() {
        return list.remove(list.size() - 1);
    }

    public T peek() {
        return list.get(list.size() - 1);
    }
}
