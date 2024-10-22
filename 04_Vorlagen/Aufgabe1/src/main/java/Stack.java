import java.util.ArrayList;

public class Stack {

    private ArrayList<String> elements;
    private int capacity;

    Stack (int capacity){
        this.capacity = capacity;
        elements = new ArrayList<String>(capacity);
    }

    public void push(String element) {
        if (elements.size() < capacity) {
            elements.add(element);
        } else {
            System.err.println("stack overflow");
        }
    }

    public String pop() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.remove(elements.size() - 1);
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public boolean isFull() {
        return elements.size() == capacity;
    }
}