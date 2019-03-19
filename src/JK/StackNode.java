package JK;


public class StackNode {

    private Node[] arr;

    private int cap;

    private int top = -1;

    public StackNode(int cap) {
        this.cap = cap;
        this.arr = new Node[cap];
    }

    public Node pop() {
        if (this.top == -1) {
            return null;
        }
        return this.arr[top--];
    }

    public boolean push(Node e) {
        if (isFull()) {
            return false;
        }
        this.arr[++top] = e;
        return true;
    }

    public boolean isFull() {
        return this.top >= this.cap;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
}
