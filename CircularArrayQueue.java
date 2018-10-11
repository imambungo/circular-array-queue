/**
 * CircularArrayQueue
 */
public class CircularArrayQueue {
    private int size;
    private int front;
    private int rear;
    private int[] array;

    public CircularArrayQueue() {
        this.size = 0;
        this.front = 0;
        this.rear = -1;
        this.array = new int[10];
    }

    public CircularArrayQueue(int arrSize) {
        this.size = 0;
        this.front = 0;
        this.rear = -1;
        this.array = new int[arrSize];
    }

    public boolean isFull() {
        return this.size == this.array.length;
    }

    public boolean isEmpty() {
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
        int returnValue = 0;
        if (isEmpty()) {
            System.out.println("Antrian sudah habis.");
        } else {
            returnValue = this.array[this.front];
            this.front = ++this.front % this.array.length;
            this.size--;
        }
        return returnValue;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian sudah habis.");
        } else {
            for (int i = this.front; i != this.rear; i = ++i % this.array.length) {
                System.out.print(this.array[i] + " ");
            }
            System.out.println(this.array[this.rear]);
        }
    }
}