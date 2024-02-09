package DSA;

public class Stack {
    private int s[] = new int[10];
    private int tos;

    Stack() {
        tos = -1; // i initialize tos as -1. because 0 means first position
    }

    public void push(int item) {
        if (tos == 9) {
            System.out.println("You're stack is full");
        } else {
            tos += 1;
            s[tos] = item;
        }
    }

    public int pop() {
        if (tos >= 0) {
            return s[tos--];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }

    }
}

