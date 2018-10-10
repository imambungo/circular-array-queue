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

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Gak muat lagi gan ¯\\_(ツ)_/¯");
        } else {
            this.rear = ++this.rear % this.array.length;
            this.array[this.rear] = value;
            this.size++;
        }
    }
}