package tp.structurededonnees.queue;

import java.util.Arrays;

public class Fifo {

    private Object[] objects;
    private int head;
    private int tail;

    public Fifo(int size) {
        if (size <=0) {
            throw new IllegalArgumentException("Negative size not allowed");
        } else {
            this.objects = new Object[size];
            this.head = 0;
            this.tail= 0;
        }

    }

    public void offer(Object object) {
        if (object == null) {
            throw new NullPointerException("Cannot add null object to the queue");
        } else if (tail == objects.length) {
            throw new IllegalStateException("Queue is full");
        } else {
            objects[tail] = object;
            tail++;
        }

    }

    public Object peek() {
        if (head == tail) {
            throw new IllegalStateException("Queue is empty");
        }
        return objects[head];
    }

    public int size(){
        return tail - head;
    }

    public Object poll() {
        if (head == tail) {
            throw new IllegalStateException("Queue is empty");
        } else {
            return objects[head++];
        }
    }

    public Boolean isEmpty(){
        if(head == tail){
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        } else {
            String result = "[" + objects[head];
            for (int i = head + 1; i < tail; i++) {
                result += ", " + objects[i];
            }
            result += "]";
            return result;
        }
    }
}
