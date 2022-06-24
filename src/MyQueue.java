import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue {
    Deque<Integer> deq = new ArrayDeque<>();

    public MyQueue() {

    }

    public void push(int x) {
        deq.addFirst(x);
    }

    public int pop() {
        return deq.removeLast();
    }

    public int peek() {
        return deq.getLast();
    }

    public boolean empty() {
        return deq.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */