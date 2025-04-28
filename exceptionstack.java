package JavaPOE;

import java.util.Scanner;

class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

class StackUnderflowException extends RuntimeException {
    public StackUnderflowException(String message) {
        super(message);
    }
}

class Stack {
    int[] arr;
    int top;
    int size;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int data) throws StackOverflowException {
        if (top == size - 1) {
            throw new StackOverflowException("Stack is full");
        }
        arr[++top] = data;
    }

    public int pop() {
        if (top == -1) {
            throw new StackUnderflowException("Stack is empty");
        }
        return arr[top--];
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class exceptionstack {
    public static void main(String[] args) throws StackOverflowException {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(3);

        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
        } catch (StackOverflowException e) {
            System.out.println(e.getMessage());
        }

        stack.display();

        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (StackUnderflowException e) {
            System.out.println(e.getMessage());
        }
    }
}
