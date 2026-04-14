// list interface with basic operations
public interface MyList<T> {
    void add(T element);
    void add(int index, T element);
    T get(int index);
    T remove(int index);
    int size();
    boolean isEmpty();
}
