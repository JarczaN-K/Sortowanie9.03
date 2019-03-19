package JK;

import java.util.Stack;

public class Tree {

    private static Node root;

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.add(value);
        }
    }

    private static void dfs() {
        StackNode stack = new StackNode(1000);
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            Node top = stack.pop();
            System.out.println(top.getValue());
            if (top.getLeft() != null) {
                stack.push(top.getLeft());
            }
            if (top.getRight() != null) {
                stack.push(top.getRight());
            }
        }
    }
}
