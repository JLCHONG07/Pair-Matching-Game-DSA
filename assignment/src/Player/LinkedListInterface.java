/**
 *
 * @author GAHSENG
 */

package Player;

public interface LinkedListInterface<T> {
    public void add(T entry);
    public void addAt(int index, T data);
    public void addAtStart(T data);
    public void replace(int index, T data);
    public T get(int index);
    public void remove();
    public boolean contains(T data);
    public boolean isEmpty();
    public boolean isFull();
    public int length();
    public void display();
}


