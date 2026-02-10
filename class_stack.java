class Stack {
    int top = -1;
    int size = 5;
    int stack[] = new int[size];

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = x;
            System.out.println(x + " pushed");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top--] + " popped");
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.pop();
    }
}
