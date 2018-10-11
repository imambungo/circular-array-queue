/**
 * CircularArrayQueue
 */
public class CircularArrayQueue {
    private int size;
    private int front;
    private int rear;
    private int[] array;

    public CircularArrayQueue() {
        this.size = 10;
        this.front = -1;
        this.rear = 0;
        this.array = new int[this.size];
    }

    public CircularArrayQueue(int size) {
        this.size = size;
        this.front = -1;
        this.rear = 0;
        this.array = new int[this.size];
    }

    public boolean isFull() {
        return this.size == this.array.length;
    }

    public boolean imEmpty() {
        return this.size == 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Gak muat lagi gan ¯\\_(ツ)_/¯");
        } else {
            this.rear = ++this.rear % this.array.length;
            this.array[this.rear] = value;
            this.size++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian sudah habis.");
        } else {
            this.front = ++this.front % this.array.length;
            this.size--;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian sudah habis.");
        } else {
            for (int i = this.front; i != this.rear; i++) {
                System.out.print(this.array[i] + " ");
            }
            System.out.println(this.array[this.rear]);
        }
    }
}