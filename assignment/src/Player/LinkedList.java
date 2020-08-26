/**
 *
 * @author GAHSENG
 */

package Player;

public class LinkedList<T> implements LinkedListInterface<T> {
    private Node head;
    private int size;
    
    @Override
    public void add(T data) {
        Node node = new Node(data);
        node.data = data;
        node.next = null;
        size++;
        
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    
    @Override
    public void addAt(int index, T data) {
        Node node = new Node(data);
        node.data = data;
        node.next = null;
        
        if(index == 0) {
            addAtStart(data);
        } else {
            Node n = head;
            for(int i = 0; i < index; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    
    @Override
    public void addAtStart(T data) {
        Node node = new Node(data);
        node.data = data;
        node.next = null;
        
        if(head != null) {
            node.next = head;
            head = node;
        } else {
            head = node;
        }
    }
    
    @Override
    public void remove() {
        while(head.next != null) {
            head.data = null;
            head = head.next;
        }
    }
    
    @Override
    public void replace(int index, T data) {
        Node node = new Node(data);
        node.data = data;
        node.next = null;
        
        Node n = head;
        Node n1 = n.next;
        if(index == 0) {
            n.data = node.data;
        } else {
            for(int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n1.next;
            n.next = node;
        }
    }
    
    @Override
    public T get(int index) {
        Node tempNode = head;
        if(index == 0) {
            return tempNode.data;
        } else {
            for(int i = size; i > index; i--) {
                tempNode = tempNode.next;
            }
            return tempNode.data;
        }
    }
    
    @Override
    public boolean contains(T data) {
        Node node = head;
        boolean match = false;
        
        for(int i = 0; i < length(); i++) {
            if(node.data == data) {
                match = true;
            }
            node = node.next;
        }
        return match;
    }
    
    @Override
    public boolean isFull() {
        return false;
    }
    
    @Override
    public boolean isEmpty() {
        if(head == null) {
            return true;
        }
        return false;
    }
    
    @Override
    public int length() {
        return size;
    }
    
    @Override
    public void display() {
        Node node = head;
        for(int i = 0; i < length(); i++) {
            System.out.println(node.data);
            node = node.next;
        }
    }
    
    private class Node {
        private T data  ;
        private Node next;
        
        private Node(T data) {
            this.data = data;
            this.next = null;
        }
        
        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
