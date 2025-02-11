package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private final List<Integer> storage;
    private int capacity;
    private int size;

    public Stack(int inputCapacity) {
        if(inputCapacity<1) throw new IllegalArgumentException("Input capacity should be greater than zero.");
        capacity = inputCapacity;
        storage = new ArrayList<>(capacity);

    }

    public boolean push(int i) {
        if(size==capacity) throw new IllegalArgumentException("Stack Full");
        size++;
        return storage.add(i);
    }

    public int pop() {
        if(size==0) throw new IllegalArgumentException("Stack empty");
        int item = storage.remove(size-1);
        size--;
        return item;
    }

    public int size() {
        return storage.size();
    }
}
