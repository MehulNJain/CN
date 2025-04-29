class QueueOverflowException extends RuntimeException {
    QueueOverflowException(String message) {
        super(message);
    }
}

class QueueUnderflowException extends Exception {
    QueueUnderflowException(String message) {
        super(message);
    }
}

class Queue {
    int front = -1, rear = -1, size;
    int[] arr;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
    }

    void enqueue(int data) {
        if (rear == size - 1) {
            throw new QueueOverflowException("Queue is full");
        }
        if (front == -1) front = 0;
        arr[++rear] = data;
    }

    int dequeue() throws QueueUnderflowException {
        if (front == -1 || front > rear) {
            throw new QueueUnderflowException("Queue is empty");
        }
        return arr[front++];
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class QueueProg {
    public static void main(String[] args) {
        Queue q = new Queue(2);
        try {
            q.enqueue(10);
            q.enqueue(20);
            q.display();
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
            System.out.println(q.dequeue());
        } catch (QueueUnderflowException e) {
            System.out.println(e.getMessage());
        }
        q.enqueue(30);
    }
}
