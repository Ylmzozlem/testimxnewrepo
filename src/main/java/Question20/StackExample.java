package Question20;

class Stack {
    private static final int MAX_SIZE = 100;
    private int[] arr;
    private int top;

    public Stack() {
        arr = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int value) {
        if (top >= MAX_SIZE - 1) {
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Top element after pop: " + stack.peek());
    }
}
