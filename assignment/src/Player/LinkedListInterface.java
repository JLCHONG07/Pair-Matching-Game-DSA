/**
 *
 * @author GAHSENG
 */

package Player;

public interface LinkedListInterface<T> {
    public void add(T entry);
    public void addAt(int index, T data);
    public void replace(int index, T data);
    public T get(int index);
    public void remove();
    public boolean isEmpty();
    public int length();
}


