import java.util.ArrayList;
import java.util.List;

class MinStack {
    List<Integer> arr=new ArrayList<>();
    int size=0;
    public MinStack() {

    }

    public void push(int val) {
        arr.add(val);
        size++;
    }

    public void pop() {
        arr.remove(size-1);
        size--;
    }

    public int top() {
        return arr.get(size-1);
    }

    public int getMin() {
        int min = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (min > arr.get(i))
                min = arr.get(i);
        }
        return min;
    }
}