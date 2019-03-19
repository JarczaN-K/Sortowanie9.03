package JK;

public class Stack {
    private int cap;
    int top = 0;
    int[] tab;

    public Stack(int cap) {
        this.cap = cap;
        this.tab = new int[cap];
    }

    public boolean push(int x) {
        if (isFull()) {
            return false;
        }
        this.tab[++top] = x;
        return true;
    }

    public Integer pop() {
        if (this.top == 0) {
            return null;
        }

        return this.tab[top--];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return this.top >= this.cap;
    }
}
