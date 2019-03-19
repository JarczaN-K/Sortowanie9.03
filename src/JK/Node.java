package JK;

public class Node {

    public int getValue() {
        return value;
    }

    private int value;

    private Node left;

    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public void add(int newValue) {
        if (newValue > value) {
            if (right == null) {
                Node newNode = new Node(newValue);
                right = newNode;
            } else {
                right.add(newValue);
            }
        } else {
            if (left == null) {
                Node newNode = new Node(newValue);
                left = newNode;
            } else {
                left.add(newValue);
            }
        }
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    private boolean check(int number) {
        boolean result;
        if (number == value) {
            result = true;
        } else if (number < value) {
            if (left == null) {
                result = false;
            } else {
                result = left.check(value);
            }
        } else {
            if (right == null) {
                result = false;
            } else {
                result = right.check(value);
            }
        }
        return result;
    }

}
